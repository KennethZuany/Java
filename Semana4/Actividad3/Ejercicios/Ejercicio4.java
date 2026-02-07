package Semana4.Actividad3.Ejercicios;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=============================================================");
        System.out.println("- - - Bienvenido al validador de calificación - - -");
        System.out.println("=============================================================");
        double calificacion = validarCalificacion(sc);
        System.out.println("=============================================================");
        System.out.println("Calificación válida ingresada: " + calificacion);
        System.out.println("=============================================================");
        
        sc.close();
    }
    
    public static double validarCalificacion(Scanner sc) {
        double calificacion;
        
        do {
            System.out.print("Ingresa una calificación (0-100): ");
            calificacion = sc.nextDouble();
            
            if (calificacion < 0 || calificacion > 100) {
                System.out.println("=============================================================");
                System.out.println("Error: La calificación debe estar entre 0 y 100");
                System.out.println("=============================================================");
            }
        } while (calificacion < 0 || calificacion > 100);
        
        return calificacion;
    }
}
