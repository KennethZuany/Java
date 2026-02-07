package Semana4.Actividad3.Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=============================================================");
        System.out.println("- - - Bienvenido a la calculadora - - -");
        System.out.println("=============================================================");
        System.out.println("--- Menú ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("=============================================================");
        
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        
        System.out.println("=============================================================");
        System.out.print("Ingresa el primer número: ");
        double num1 = sc.nextDouble();
        
        System.out.println("=============================================================");
        System.out.print("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("=============================================================");
        
        double resultado = 0;
        
        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = restar(num1, num2);
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            default:
                System.out.println("Opción no válida");
        }
        System.out.println("=============================================================");
        sc.close();
    }
    
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    public static double restar(double a, double b) {
        return a - b;
    }
}
