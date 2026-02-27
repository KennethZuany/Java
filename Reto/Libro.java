// Clase que representa un libro en la biblioteca
public class Libro {

    // atributos privados segun el diseño de la fase 1
    private String isbn;
    private String titulo;
    private String autor;
    private int ejemplaresDisponibles;

    // constructor con todos los datos del libro
    public Libro(String isbn, String titulo, String autor, int ejemplaresDisponibles) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    // getters y setters de cada atributo

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    // metodo para mostrar la info del libro bonito
    public void mostrarInfo() {
        System.out.println("ISBN: " + isbn + " | Titulo: " + titulo + " | Autor: " + autor + " | Disponibles: " + ejemplaresDisponibles);
    }
}