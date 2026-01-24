package Semana2;
import java.util.Scanner;
public class Actividad2Parte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Inicio
        System.out.println("=======================================================================");
        System.out.println("Bienvenido al programa. Da enter para continuar...");
        System.out.println("=======================================================================");
        scanner.nextLine();
        // Generar números pares desde 2 hasta 100
        int[] numerosPares = new int[50];
        // Almacenar números pares en el arreglo
        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = 2 * (i + 1);
        }
        // Mostrar los números almacenados
        System.out.println("=======================================================================");
        System.out.println("Lista de números pares del 2 al 100:");
        System.out.println("=======================================================================");
        for (int i = 0; i < numerosPares.length; i++) {
            System.out.println(numerosPares[i]);
        }
        System.out.println("=======================================================================");
        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }
}