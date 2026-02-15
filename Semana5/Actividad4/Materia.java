package Semana5.Actividad4;

public class Materia {
    private String nombre;
    private String clave;
    private int creditos;
    private int horasSemanales;
    
    // Constructor por defecto
    public Materia() {
        this.nombre = "";
        this.clave = "";
        this.creditos = 0;
        this.horasSemanales = 0;
    }
    
    // Constructor con parámetros
    public Materia(String nombre, String clave, int creditos, int horasSemanales) {
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
    }
    
    // Constructor de copia
    public Materia(Materia otra) {
        this.nombre = otra.nombre;
        this.clave = otra.clave;
        this.creditos = otra.creditos;
        this.horasSemanales = otra.horasSemanales;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getClave() { return clave; }
    public int getCreditos() { return creditos; }
    public int getHorasSemanales() { return horasSemanales; }
    
    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setClave(String clave) { this.clave = clave; }
    public void setCreditos(int creditos) { this.creditos = creditos; }
    public void setHorasSemanales(int horasSemanales) { this.horasSemanales = horasSemanales; }
    
    @Override
    public String toString() {
        return nombre + " [" + clave + "] - " + creditos + " créditos - " + horasSemanales + " hrs/sem";
    }
}