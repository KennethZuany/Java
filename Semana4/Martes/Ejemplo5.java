package Semana4.Martes;

public class Ejemplo5 {
    public static int operar(int a, int b) {
        return a + b;
    }
    public static int operar(int a, int b, int c) {
        return a + b + c;
    }
    public static double operar(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division por cero");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        System.out.println("Suma de dos enteros: " + operar(4, 5));
        System.out.println("Suma de tres enteros: " + operar(4, 5, 6));
        System.out.println("Division: " + operar(9.0, 3.0));
        System.out.println("Division no valida: " + operar(9.0, 0.0));
    }
}
