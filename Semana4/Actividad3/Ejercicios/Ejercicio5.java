package Semana4.Actividad3.Ejercicios;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double total = 0;
        int numeroVentas = 0;
        
        System.out.println("=============================================================");
        System.out.println("- - - Bienvenido al registro de venta - - -");
        System.out.println("=============================================================");
        System.out.println("Ingresa las ventas (ingresa -1 para cancelar)");

        double[] datosVentas = capturarVentas(sc);
        total = datosVentas[0];
        numeroVentas = (int) datosVentas[1];
        
        double promedio = calcularPromedio(total, numeroVentas);
        
        System.out.println("=============================================================");
        System.out.println("- - - Resumen de ventas - - -");
        System.out.println("=============================================================");
        System.out.println("Total vendido: $" + total);
        System.out.println("Número de ventas: " + numeroVentas);
        System.out.println("Promedio por venta: $" + promedio);
        System.out.println("=============================================================");
        
        sc.close();
    }
    
    public static double[] capturarVentas(Scanner sc) {
        double total = 0;
        int contador = 0;
        double venta;
        
        do {
            System.out.println("=============================================================");
            System.out.print("Venta #" + (contador + 1) + ": $");
            venta = sc.nextDouble();
            
            if (venta != -1) {
                total = calcularTotal(total, venta);
                contador++;
            }
        } while (venta != -1);
        
        return new double[]{total, contador};
    }
    
    public static double calcularTotal(double totalActual, double nuevaVenta) {
        return totalActual + nuevaVenta;
    }
    
    public static double calcularPromedio(double total, int numeroVentas) {
        if (numeroVentas == 0) {
            return 0;
        }
        return total / numeroVentas;
    }
}
