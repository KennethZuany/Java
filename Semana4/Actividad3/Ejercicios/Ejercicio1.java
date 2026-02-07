package Semana4.Actividad3.Ejercicios;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=============================================================");
        System.out.println("- - - Bienvenido al convertidor de metros a centímetros - - -");
        System.out.println("=============================================================");
        
        System.out.print("Ingresa la cantidad en metros: ");
        double metros = sc.nextDouble();
        
        double centimetros = convertirMetrosCentimetros(metros);
       
        System.out.println("=============================================================");
        System.out.println("- - - Resultado - - -");
        System.out.println(metros + " metros = " + centimetros + " centímetros");
        System.out.println("=============================================================");
        
        sc.close();
    }
    
    public static double convertirMetrosCentimetros(double metros) {
        return metros * 100;
    }
}