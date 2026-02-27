// clase principal para probar todo el sistema
// aqui pongo datos quemados para simular el uso real de la biblioteca
public class Main {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("  SISTEMA DE GESTION DE BIBLIOTECA       ");
        System.out.println("  Fase II - Kenneth Zuany Ortega          ");
        System.out.println("=========================================");

        // creo la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central UNAM");

        // ======== AGREGO LIBROS ========
        System.out.println("\n--- Registrando libros en el sistema ---");
        Libro libro1 = new Libro("978-0-061-96436-9", "El Hobbit", "J.R.R. Tolkien", 3);
        Libro libro2 = new Libro("978-0-743-27356-5", "El Gran Gatsby", "F. Scott Fitzgerald", 1);
        Libro libro3 = new Libro("978-0-452-28423-4", "1984", "George Orwell", 2);
        Libro libro4 = new Libro("978-0-316-76948-0", "El Cazador Oculto", "J.D. Salinger", 0); // este no tiene ejemplares

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);

        // ======== REGISTRO DE USUARIOS ========
        System.out.println("\n--- Registrando usuarios ---");

        // creo dos alumnos y un profesor para demostrar la herencia
        Alumno alumno1 = new Alumno("A001", "Maria Garcia", "20210001", "Ingenieria en Sistemas");
        Alumno alumno2 = new Alumno("A002", "Carlos Lopez", "20210002", "Contaduria");
        Profesor profesor1 = new Profesor("P001", "Dr. Roberto Sanchez", "EMP-555", "Ciencias Computacionales");

        biblioteca.registrarUsuario(alumno1);
        biblioteca.registrarUsuario(alumno2);
        biblioteca.registrarUsuario(profesor1);

        // muestro el catalogo y los usuarios registrados
        biblioteca.mostrarTodosLosLibros();
        biblioteca.mostrarTodosLosUsuarios();

        // ======== PRUEBA DE POLIMORFISMO ========
        // aqui demuestro que getLimiteLibros() se comporta diferente segun el tipo
        System.out.println("\n--- Verificacion de limites por tipo de usuario ---");
        System.out.println(alumno1.getNombre() + " es tipo: " + alumno1.getTipoUsuario() + " | Limite: " + alumno1.getLimiteLibros() + " libros");
        System.out.println(profesor1.getNombre() + " es tipo: " + profesor1.getTipoUsuario() + " | Limite: " + profesor1.getLimiteLibros() + " libros");

        // ======== PRUEBAS DE PRESTAMOS EXITOSOS ========
        System.out.println("\n======== PRUEBAS DE PRESTAMOS ========");

        // prestamo 1: exitoso
        biblioteca.realizarPrestamo("A001", "978-0-061-96436-9", "2024-11-10");

        // prestamo 2: exitoso (segundo libro del mismo usuario)
        biblioteca.realizarPrestamo("A001", "978-0-452-28423-4", "2024-11-10");

        // prestamo para el otro alumno
        biblioteca.realizarPrestamo("A002", "978-0-743-27356-5", "2024-11-10");

        // prestamo para el profesor
        biblioteca.realizarPrestamo("P001", "978-0-061-96436-9", "2024-11-10");

        // ======== PRUEBAS DE PRESTAMOS FALLIDOS ========
        System.out.println("\n======== PRUEBAS DE VALIDACIONES (deben fallar) ========");

        // falla 1: el alumno1 ya tiene 2 libros, llego al limite
        biblioteca.realizarPrestamo("A001", "978-0-743-27356-5", "2024-11-10");

        // falla 2: el libro de Salinger tiene 0 ejemplares disponibles
        biblioteca.realizarPrestamo("P001", "978-0-316-76948-0", "2024-11-10");

        // falla 3: usuario que no existe
        biblioteca.realizarPrestamo("X999", "978-0-061-96436-9", "2024-11-10");

        // falla 4: isbn que no existe
        biblioteca.realizarPrestamo("A002", "999-0-000-00000-0", "2024-11-10");

        // muestro como quedaron los prestamos activos
        biblioteca.mostrarPrestamosActivos();

        // muestro el catalogo actualizado con el stock cambiado
        biblioteca.mostrarTodosLosLibros();

        // ======== PRUEBA DE DEVOLUCION ========
        System.out.println("\n======== PRUEBA DE DEVOLUCION ========");
        biblioteca.devolverLibro("A001", "978-0-061-96436-9");

        // muestro como quedo todo despues de la devolucion
        System.out.println("\n--- Estado final del sistema ---");
        biblioteca.mostrarPrestamosActivos();
        biblioteca.mostrarTodosLosLibros();
        biblioteca.mostrarTodosLosUsuarios();

        System.out.println("\n=========================================");
        System.out.println("  FIN DE LAS PRUEBAS DEL SISTEMA         ");
        System.out.println("=========================================");
    }
}