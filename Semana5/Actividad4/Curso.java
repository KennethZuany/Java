package Semana5.Actividad4;

public class Curso {
    private String nombre;
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;
    
    // Constructor por defecto
    public Curso() {
        this.nombre = "";
        this.materia1 = new Materia();
        this.materia2 = new Materia();
        this.materia3 = new Materia();
    }
    
    // Constructor con parámetros
    public Curso(String nombre, Materia materia1, Materia materia2, Materia materia3) {
        this.nombre = nombre;
        this.materia1 = new Materia(materia1);
        this.materia2 = new Materia(materia2);
        this.materia3 = new Materia(materia3);
    }
    
    // Constructor de copia
    public Curso(Curso otro) {
        this.nombre = otro.nombre;
        this.materia1 = new Materia(otro.materia1);
        this.materia2 = new Materia(otro.materia2);
        this.materia3 = new Materia(otro.materia3);
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public Materia getMateria1() { return materia1; }
    public Materia getMateria2() { return materia2; }
    public Materia getMateria3() { return materia3; }
    
    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setMateria1(Materia materia1) { this.materia1 = new Materia(materia1); }
    public void setMateria2(Materia materia2) { this.materia2 = new Materia(materia2); }
    public void setMateria3(Materia materia3) { this.materia3 = new Materia(materia3); }
    
    // Método funcional
    public int calcularCreditosTotales() {
        return materia1.getCreditos() + materia2.getCreditos() + materia3.getCreditos();
    }
    
    @Override
    public String toString() {
        return nombre + " - Créditos totales: " + calcularCreditosTotales() + "\n" +
               "  1. " + materia1.toString() + "\n" +
               "  2. " + materia2.toString() + "\n" +
               "  3. " + materia3.toString();
    }
}