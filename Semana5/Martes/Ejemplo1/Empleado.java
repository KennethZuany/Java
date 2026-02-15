package Semana5.Martes.Ejemplo1;

public class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase)  {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public final double calcularSalarioBase()   {
        return salarioBase;
    }

    public abstract double calcularBono();
}

