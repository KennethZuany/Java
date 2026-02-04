package Semana4.Miercoles.Ejemplo2;
import java.util.Scanner;
public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantas calificaciones deseas ingresar? ");
        int n = sc.nextInt();

        double suma = 0;
        double mayor = 0;
        double menor = 100;

        for (int i = 1; i <= n; i++) {
            double calificacion = leerCalificacion(sc, i);
            suma += calificacion;

            if (calificacion > mayor) {
                mayor = calificacion;
            }
            if (calificacion < menor) {
                menor = calificacion;
            }
        }
        double promedio = suma / n;
        mostrarResultado(promedio, mayor, menor);
    }
    public static double leerCalificacion(Scanner sc, int num) {
        double cal;
        do {
            System.out.print("Calificación: " + num + ": ");
            cal = sc.nextDouble();
        
        } while (cal < 0 || cal > 100);
        return cal;
    }

    public static void mostrarResultado(double promedio, double mayor, double menor) {
        System.out.println("\n - - - Resultados - - -");
        System.out.println("Promedio: " + promedio);
        System.out.println("Mayor calificación: " + mayor);
        System.out.println("Menor calificación: " + menor);
    }
}




