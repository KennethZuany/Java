package Semana3.Martes;
import java.util.Scanner;
public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[5];
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++);   {
        System.out.print("Ingresa un numero: ");
        numeros[i] = sc.nextInt();
    }

    System.out.print("Numero a buscar: ");
    int buscar = sc.nextInt();

    for (int i = 0; i < numeros.length; i++);   {
        if (numeros[i] == buscar)   {
            encontrado = true;
            break;
        }
    }
    
        if (encontrado) {
            System.out.println("El numero Si esta en el arreglo");
        }   else    {
            System.out.println("El numero No esta en el arreglo");
        }
    }
}
