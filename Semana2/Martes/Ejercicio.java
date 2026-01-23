package Semana2.Martes;
import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int minus = a - b;
        int multiply = a * b;
        double divide = (double) a / b;

        boolean bothPositive = a > 0 && b > 0;
        boolean sumGreaterThanMultiply = sum > multiply;

        System.out.println(" - - - Resultados - - - " );
        System.out.println("Suma: " + sum);
        System.out.println("Resta: " + minus);
        System.out.println("Multiplicación: " + multiply);
        System.out.println("División: " + divide);
        System.out.println("¿Ambos números son positivos?: " + bothPositive);
        System.out.println("¿La suma es mayor que la multiplicación?: " + sumGreaterThanMultiply);
        scanner.close();
    }
}
