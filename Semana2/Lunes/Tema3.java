package Semana2.Lunes;
import java.util.Scanner;

public class Tema3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int var1 = scanner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int var2 = scanner.nextInt();
        System.out.printf("El producto entre los dos número es: %d",(var1 * var2));
        scanner.close();
    }
}