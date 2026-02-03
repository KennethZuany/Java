package Semana4.Martes;

public class Ejemplo3 {
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static int sumar (int a, int b, int c) {
        return sumar(a, b) + c;
    }
    public static void main(String[] args) {
        System.out.println("La suma de dos numeros es: " + sumar(5, 10));
        System.out.println("La suma de tres numeros es: " + sumar(5, 10, 15));
    }
}
