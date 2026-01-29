package Semana3.Martes;
import java.util.Scanner;
public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Inicio
        System.out.println("=======================================================================");
        System.out.println("Bienvenido al programa. Da enter para continuar...");
        System.out.println("=======================================================================");
        scanner.nextLine();

        double[] calificaciones = new double[5];
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");

            calificaciones[i] = scanner.nextDouble();
            suma += calificaciones[i];
        }

        double promedio = suma / calificaciones.length;
        System.out.printf("El promedio de las calificaciones es: " + promedio);

        scanner.close();
    }
}
