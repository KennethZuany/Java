package Semana5.Lunes.Ejemplo1;

public class UtilidadesMatematicas {
    public static int calcularCuadrado(int numero)  {
        return numero * numero;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Cuadrado: " + calcularCuadrado(n));
        System.out.println("Es par? " + esPar(n));
    }
}
