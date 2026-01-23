package POO.Semana2.Miercoles;

import java.util.Scanner;

public class ejercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra o frase: ");
        String cadena = scanner.nextLine();
        
        System.out.println("Longitud total de la cadena: " + cadena.length());
        
        if (cadena.length() > 0) {
            System.out.println("Primer carácter: " + cadena.charAt(0));
        }
        
        if (cadena.length() > 0) {
            System.out.println("Último carácter: " + cadena.charAt(cadena.length() - 1));
        }
        
        if (cadena.isEmpty()) {
            System.out.println("La cadena está vacía.");
        } else {
            System.out.println("La cadena NO está vacía.");
        }
        
        System.out.println("El análisis ha finalizado.");
        
        scanner.close();
    }
}
