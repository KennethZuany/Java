package Semana5.Jueves.Ejemplo2;

public class Empleado {
    String nombre;
    double salario;

    public Empleado(String nombre, double salario)  {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInfo()   {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan", 2500.50);
        Empleado e2 = new Empleado("Maria", 3000.75);
        
        e1.mostrarInfo();
        e2.mostrarInfo();
    }

}
