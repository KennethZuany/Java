package POO.Semana2;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la calificación del examen: ");
        double examen = scanner.nextDouble();
        System.out.print("Ingresa la calificación del proyecto: ");
        double proyecto = scanner.nextDouble();
        
        double valorexamen = examen * 0.4;
        double valorproyecto = proyecto * 0.6;
        
        double promedio = valorexamen + valorproyecto;
        System.out.println("El promedio decimal es: " + promedio);
        int promedioEntero = (int) (valorexamen + valorproyecto);
        System.out.println("El promedio entero es: " + promedioEntero);
        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        scanner.close();
    }
}
