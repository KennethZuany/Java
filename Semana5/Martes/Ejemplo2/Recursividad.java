package Semana5.Martes.Ejemplo2;

public class Recursividad {
    public static int suma(int n)   {
        if (n == 1) {
            return 1;
        }
        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        int resultado = suma(5);
        System.out.println("La suma del 1 al 5 es: " + resultado);
    }
}
