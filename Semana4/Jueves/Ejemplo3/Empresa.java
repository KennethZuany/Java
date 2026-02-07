package Semana4.Jueves.Ejemplo3;

public class Empleado {
    String nombre;
    double salario;

    Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    double calcularSalario() {
        return salario;
    }
}

class EmpleadoTiempoCompleto extends Empleado {
    double bono;

    EmpleadoTiempoCompleto(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }
    @Override
    double calcularSalario() {
        return salario + bono;
    }
}

public class Empresa {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ana", 3000 );
        Empleado e2 = new EmpleadoTiempoCompleto("Luis", 3000, 500);
        System.out.println(e1.calcularSalario());
        System.out.println(e2.calcularSalario());
    }
}