package Semana5.Actividad4;

public class Alumno {
    private String matricula;
    private String nombre;
    private int edad;
    private Curso curso;
    
    // Constructor por defecto
    public Alumno() {
        this.matricula = "";
        this.nombre = "";
        this.edad = 0;
        this.curso = null;
    }
    
    // Constructor con parámetros
    public Alumno(String matricula, String nombre, int edad, Curso curso) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso; 
    }
    
    // Constructor de copia
    public Alumno(Alumno otro) {
        this.matricula = otro.matricula;
        this.nombre = otro.nombre;
        this.edad = otro.edad;
        this.curso = otro.curso;
    }
    
    // Getters
    public String getMatricula() { return matricula; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public Curso getCurso() { return curso; }
    
    // Setters
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setCurso(Curso curso) { this.curso = curso; }
    
    // Método funcional
    public int obtenerCargaAcademica() {
        if (curso != null) {
            return curso.calcularCreditosTotales();
        }
        return 0;
    }
    
    @Override
    public String toString() {
        String cursoNombre = (curso != null) ? curso.getNombre() : "Sin curso";
        return nombre + " [" + matricula + "] - Edad: " + edad + 
               " - Curso: " + cursoNombre + " - Créditos: " + obtenerCargaAcademica();
    }
}