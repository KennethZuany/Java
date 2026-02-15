package Semana5.Martes.Ejemplo1;

public class EmpleadoVentas extends Empleado {
    public EmpleadoVentas(String nombe, double salarioBase) {
        super(nombe, salarioBase);
    }

    @Override
    public double calcularBono()    {
        return salarioBase * 0.2;
    }
}
