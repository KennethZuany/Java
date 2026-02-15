package Semana5.Martes.Ejemplo1;

public class Main   {
    public static void main(String[] args) {
        Empleado admin = new EmpleadoAdministrativo("Ana", 10000);
        Empleado ventas = new Empleado("Carlos", 15000);

        System.out.println("Empleado administrativo");
        System.out.println("Salario base: " + admin.calcularSalarioBase());
        System.out.println("Bono: " + admin.calcularBono());

        System.out.println("\nEmpleado ventas");
        System.out.println("Salario base: " + ventas.calcularSalarioBase());
        System.out.println("Bono: " + ventas.calcularBono());
    }
}