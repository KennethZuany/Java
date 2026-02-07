package Semana4.Actividad3.Ejercicios;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("- - - Bienvenido - - -");
        System.out.println("=============================================================");
        
        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();
        
        System.out.println("=============================================================");
        System.out.println("- - - Resultado - - -");
        if (esPar(numero)) {
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("El número " + numero + " es impar");
        }
        System.out.println("=============================================================");
        
        sc.close();
    }
    
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
