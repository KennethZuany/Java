package Semana4.Miercoles.Ejemplo3;
import java.util.Scanner;
public class Cajero {
    static double saldo = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> consultarSaldo();
                case 2 -> depositar(sc);
                case 3 -> retirar(sc);
                case 4 -> System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                default -> System.out.println("Opción invalida. Intente de nuevo.");
            }
        } while (opcion != 4); 
        
    }
    public static void mostrarMenu() {
        System.out.println("\n - - - Cajero Automatico - - -");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Retirar");
        System.out.println("4. Salir");
    }

    public static void consultarSaldo() {
        System.out.println("Su saldo actual es: $" + saldo);
    }

    public static void depositar(Scanner sc) {
        System.out.print("Monto a depositar: $");
        double monto = sc.nextDouble();
        saldo += monto;
    }

    public static void retirar(Scanner sc) {
        System.out.print("Monto a retirar: $");
        double monto = sc.nextDouble();
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
