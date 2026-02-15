package Semana5.Martes.Ejemplo1;

public class EmpleadoAdministrativo extends Empleado    {
    public EmpleadoAdministrativo(String nombre, double salarioBase)    {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularBono()    {
        return salarioBase * 0.1;
    }
}
