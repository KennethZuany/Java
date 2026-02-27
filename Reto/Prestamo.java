// esta clase guarda la informacion de cada prestamo que se hace
public class Prestamo {

    private String folio;
    private String fechaInicio;
    // guardo el libro y el usuario que esta involucrado en el prestamo
    private Libro libro;
    private Usuario usuario;

    public Prestamo(String folio, String fechaInicio, Libro libro, Usuario usuario) {
        this.folio = folio;
        this.fechaInicio = fechaInicio;
        this.libro = libro;
        this.usuario = usuario;
    }

    // getters y setters de todos los atributos

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void mostrarInfo() {
        System.out.println("Folio: " + folio + " | Fecha: " + fechaInicio + " | Libro: " + libro.getTitulo() + " | Usuario: " + usuario.getNombre());
    }
}