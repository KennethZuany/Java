package POO.Semana2;

import java.util.Scanner;

public class actividad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Nombre específico que definimos en el programa
        String nombreEsperado = "Juan";
        
        // Solicitar al usuario que ingrese su nombre
        System.out.println("Por favor, ingresa tu nombre:");
        String nombreIngresado = scanner.nextLine();
        
        // Comparación con sensibilidad a mayúsculas y minúsculas (case-sensitive)
        // Esto significa que "Juan" es diferente de "juan" o "JUAN"
        if (nombreIngresado.equals(nombreEsperado)) {
            System.out.println("¡Hola " + nombreIngresado + "! Eres el usuario esperado.");
            System.out.println("Bienvenido al sistema.");
        } else {
            // Comparación sin sensibilidad a mayúsculas y minúsculas (case-insensitive)
            // Esto significa que "Juan", "juan", "JUAN" se consideran iguales
            if (nombreIngresado.equalsIgnoreCase(nombreEsperado)) {
                System.out.println("¡Hola " + nombreIngresado + "!");
                System.out.println("Tu nombre coincide, pero las mayúsculas/minúsculas son diferentes.");
                System.out.println("El nombre esperado es: " + nombreEsperado);
            } else {
                System.out.println("Hola " + nombreIngresado + ".");
                System.out.println("Tu nombre no coincide con el nombre esperado.");
                System.out.println("El nombre esperado es: " + nombreEsperado);
            }
        }
        
        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }
}
