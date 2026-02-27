import java.util.ArrayList;

// esta es la clase principal que administra todo el sistema
public class Biblioteca {

    private String nombre;
    // listas donde guardo los libros, usuarios y prestamos
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Prestamo> prestamos;
    // contador para generar folios automatico
    private int contadorFolio;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>();
        this.usuarios = new ArrayList<Usuario>();
        this.prestamos = new ArrayList<Prestamo>();
        this.contadorFolio = 1;
    }

    // ======== METODOS PARA LIBROS ========

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    // busco un libro por isbn recorriendo toda la lista
    public Libro buscarLibroPorIsbn(String isbn) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)) {
                return libros.get(i);
            }
        }
        // si no lo encuentro regreso null
        return null;
    }

    public void mostrarTodosLosLibros() {
        System.out.println("\n--- CATALOGO DE LIBROS ---");
        if (libros.size() == 0) {
            System.out.println("No hay libros registrados.");
            return;
        }
        for (int i = 0; i < libros.size(); i++) {
            libros.get(i).mostrarInfo();
        }
    }

    // ======== METODOS PARA USUARIOS ========

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre() + " (" + usuario.getTipoUsuario() + ")");
    }

    // busco usuario por su id
    public Usuario buscarUsuarioPorId(String idUsuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getIdUsuario().equals(idUsuario)) {
                return usuarios.get(i);
            }
        }
        return null;
    }

    public void mostrarTodosLosUsuarios() {
        System.out.println("\n--- LISTA DE USUARIOS ---");
        if (usuarios.size() == 0) {
            System.out.println("No hay usuarios registrados.");
            return;
        }
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.get(i).mostrarInfo();
        }
    }

    // ======== METODOS PARA PRESTAMOS ========

    public void realizarPrestamo(String idUsuario, String isbnLibro, String fecha) {
        System.out.println("\n>> Intentando prestar libro ISBN: " + isbnLibro + " al usuario ID: " + idUsuario);

        // primero busco al usuario
        Usuario usuario = buscarUsuarioPorId(idUsuario);
        if (usuario == null) {
            System.out.println("ERROR: No existe el usuario con ID " + idUsuario);
            return;
        }

        // luego busco el libro
        Libro libro = buscarLibroPorIsbn(isbnLibro);
        if (libro == null) {
            System.out.println("ERROR: No existe el libro con ISBN " + isbnLibro);
            return;
        }

        // valido que haya ejemplares disponibles
        if (libro.getEjemplaresDisponibles() == 0) {
            System.out.println("ERROR: No hay ejemplares disponibles del libro '" + libro.getTitulo() + "'");
            return;
        }

        // valido que el usuario no haya llegado a su limite de libros
        // uso getLimiteLibros() que es polimorfico, cada tipo de usuario tiene su limite
        if (usuario.getCantidadLibrosPrestados() >= usuario.getLimiteLibros()) {
            System.out.println("ERROR: El usuario " + usuario.getNombre() + " ya llego a su limite de " + usuario.getLimiteLibros() + " libros prestados");
            return;
        }

        // si pase todas las validaciones hago el prestamo
        // genero el folio automatico con el contador
        String folio = "FOLIO-" + contadorFolio;
        contadorFolio++;

        Prestamo nuevoPrestamo = new Prestamo(folio, fecha, libro, usuario);
        prestamos.add(nuevoPrestamo);

        // le resto 1 al stock del libro
        libro.setEjemplaresDisponibles(libro.getEjemplaresDisponibles() - 1);

        // agrego el libro a la lista de prestados del usuario
        usuario.agregarLibroPrestado(libro);

        System.out.println("EXITO: Prestamo realizado correctamente!");
        nuevoPrestamo.mostrarInfo();
    }

    public void devolverLibro(String idUsuario, String isbnLibro) {
        System.out.println("\n>> Procesando devolucion del libro ISBN: " + isbnLibro + " del usuario ID: " + idUsuario);

        Usuario usuario = buscarUsuarioPorId(idUsuario);
        if (usuario == null) {
            System.out.println("ERROR: No existe el usuario con ID " + idUsuario);
            return;
        }

        Libro libro = buscarLibroPorIsbn(isbnLibro);
        if (libro == null) {
            System.out.println("ERROR: No existe el libro con ISBN " + isbnLibro);
            return;
        }

        // busco en los prestamos activos si existe ese prestamo
        boolean encontrado = false;
        for (int i = 0; i < prestamos.size(); i++) {
            Prestamo p = prestamos.get(i);
            // verifico que el prestamo sea del mismo usuario y el mismo libro
            if (p.getUsuario().getIdUsuario().equals(idUsuario) && p.getLibro().getIsbn().equals(isbnLibro)) {
                // lo elimino de la lista de prestamos activos
                prestamos.remove(i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("ERROR: No se encontro un prestamo activo para ese usuario y libro");
            return;
        }

        // le sumo 1 de vuelta al stock
        libro.setEjemplaresDisponibles(libro.getEjemplaresDisponibles() + 1);
        // quito el libro de la lista del usuario
        usuario.quitarLibroPrestado(libro);

        System.out.println("EXITO: Libro '" + libro.getTitulo() + "' devuelto correctamente por " + usuario.getNombre());
    }

    public void mostrarPrestamosActivos() {
        System.out.println("\n--- PRESTAMOS ACTIVOS ---");
        if (prestamos.size() == 0) {
            System.out.println("No hay prestamos activos.");
            return;
        }
        for (int i = 0; i < prestamos.size(); i++) {
            prestamos.get(i).mostrarInfo();
        }
    }
}