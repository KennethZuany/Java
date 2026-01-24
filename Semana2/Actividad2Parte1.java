package Semana2;
import java.util.Scanner;
public class Actividad2Parte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nombre definido
        String nombreEsperado = "Juan";
        // Inicio
        System.out.println("=======================================================================");
        System.out.println("Bienvenido al programa. Da enter para continuar...");
        System.out.println("=======================================================================");
        scanner.nextLine();
        // Nombre
        System.out.println("=======================================================================");
        System.out.println("Por favor, ingresa tu nombre:");
        System.out.println("=======================================================================");
        String nombreIngresado = scanner.nextLine();
        // ¿El nombre es idéntico?
        if (nombreIngresado.equals(nombreEsperado)) {
            System.out.println("=======================================================================");
            System.out.println("¡Hola " + nombreIngresado + "! Eres el usuario esperado.");
            System.out.println("Bienvenido al programa.");
            System.out.println("=======================================================================");
        } else {
            // ¿El nombre coincide?
            if (nombreIngresado.equalsIgnoreCase(nombreEsperado)) {
                System.out.println("=======================================================================");
                System.out.println("¡Hola " + nombreIngresado + "!");
                System.out.println("Tu nombre coincide, pero las mayúsculas/minúsculas son diferentes.");
                System.out.println("El nombre esperado es: " + nombreEsperado);
                System.out.println("=======================================================================");
            } else {
                // No coincide
                System.out.println("=======================================================================");
                System.out.println("Hola " + nombreIngresado + ".");
                System.out.println("Tu nombre no coincide con el nombre esperado.");
                System.out.println("El nombre esperado es: " + nombreEsperado);
                System.out.println("=======================================================================");
            }
        }
        
        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }
}