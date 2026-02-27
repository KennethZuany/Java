import java.util.ArrayList;

// esta es la clase padre de Alumno y Profesor
// aqui guardo los datos generales de cualquier usuario
public class Usuario {

    private String idUsuario;
    private String nombre;
    // aqui guardo los libros que tiene prestados el usuario
    private ArrayList<Libro> librosPrestados;

    public Usuario(String idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        // inicializo la lista vacia para que no me de NullPointerException despues
        this.librosPrestados = new ArrayList<Libro>();
    }

    // getters y setters

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    // este metodo devuelve el limite de libros que puede pedir
    // lo voy a sobreescribir en las clases hijas (polimorfismo!)
    public int getLimiteLibros() {
        return 2;
    }

    // metodo para saber cuantos libros lleva prestados
    public int getCantidadLibrosPrestados() {
        return librosPrestados.size();
    }

    // agrego un libro a la lista del usuario
    public void agregarLibroPrestado(Libro libro) {
        librosPrestados.add(libro);
    }

    // quito un libro cuando lo devuelve
    public void quitarLibroPrestado(Libro libro) {
        // recorro la lista para encontrar el libro por isbn
        for (int i = 0; i < librosPrestados.size(); i++) {
            if (librosPrestados.get(i).getIsbn().equals(libro.getIsbn())) {
                librosPrestados.remove(i);
                break; // ya lo encontre, salgo del for
            }
        }
    }

    // metodo que describre el tipo de usuario, lo van a sobreescribir las hijas
    public String getTipoUsuario() {
        return "Usuario General";
    }

    public void mostrarInfo() {
        System.out.println("ID: " + idUsuario + " | Nombre: " + nombre + " | Tipo: " + getTipoUsuario() + " | Libros prestados: " + librosPrestados.size() + "/" + getLimiteLibros());
    }
}