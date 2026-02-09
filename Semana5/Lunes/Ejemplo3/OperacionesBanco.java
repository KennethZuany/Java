package Semana5.Lunes.Ejemplo3;

public class OperacionesBanco {
    public static void depositar(CuentaBancaria cuenta, double monto)   {
        cuenta.setSaldo(cuenta.getSaldo() + monto);
    }
    public static void retirar(CuentaBancaria cuenta, double monto) {
        cuenta.setSaldo(cuenta.getSaldo() - monto);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", 1000.0);
        cuenta.mostrarDatos();
        depositar(cuenta, 500);
        System.out.println("\nDespues del deposito: $");
        cuenta.mostrarDatos();

        retirar(cuenta, 200);
        System.out.println("\nDespues del retiro: $");
        cuenta.mostrarDatos();
    }
}
