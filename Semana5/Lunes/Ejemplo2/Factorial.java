package Semana5.Lunes.Ejemplo2;
import java.util.Scanner;

public class Factorial {
    public static int calcularFactorial(int n)  {
        if (n == 0) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        System.out.println("El factorial de " + numero + "es " + calcularFactorial(numero));
    }
}
