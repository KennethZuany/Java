package Semana5.Actividad4;

public class Profesor {
    private String nombre;
    private String numeroNomina;
    private double sueldoPorHora;
    private Materia materiaImpartida;
    
    // Constructor por defecto
    public Profesor() {
        this.nombre = "";
        this.numeroNomina = "";
        this.sueldoPorHora = 0.0;
        this.materiaImpartida = null;
    }
    
    // Constructor con parámetros
    public Profesor(String nombre, String numeroNomina, double sueldoPorHora, Materia materiaImpartida) {
        this.nombre = nombre;
        this.numeroNomina = numeroNomina;
        this.sueldoPorHora = sueldoPorHora;
        this.materiaImpartida = materiaImpartida;
    }
    
    // Constructor de copia
    public Profesor(Profesor otro) {
        this.nombre = otro.nombre;
        this.numeroNomina = otro.numeroNomina;
        this.sueldoPorHora = otro.sueldoPorHora;
        this.materiaImpartida = otro.materiaImpartida;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getNumeroNomina() { return numeroNomina; }
    public double getSueldoPorHora() { return sueldoPorHora; }
    public Materia getMateriaImpartida() { return materiaImpartida; }
    
    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNumeroNomina(String numeroNomina) { this.numeroNomina = numeroNomina; }
    public void setSueldoPorHora(double sueldoPorHora) { this.sueldoPorHora = sueldoPorHora; }
    public void setMateriaImpartida(Materia materiaImpartida) { this.materiaImpartida = materiaImpartida; }
    
    // Método funcional
    public double calcularSueldoSemanal() {
        if (materiaImpartida != null) {
            return sueldoPorHora * materiaImpartida.getHorasSemanales();
        }
        return 0.0;
    }
    
    @Override
    public String toString() {
        String materia = (materiaImpartida != null) ? materiaImpartida.getNombre() : "Sin materia";
        return nombre + " [" + numeroNomina + "] - Materia: " + materia + " - Sueldo semanal: $" + 
               String.format("%.2f", calcularSueldoSemanal());
    }
}