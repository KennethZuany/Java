package Semana3.Jueves;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingresa tu edad:");
            int edad = sc.nextInt();
            System.out.println("Tu edad es: " + edad);
        }   catch   (InputMismatchException e)  {
            System.out.println("Error: Entrada no válida. Por favor, ingresa un número entero.");
        }
    }
}
