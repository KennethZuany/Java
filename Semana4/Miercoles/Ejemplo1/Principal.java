import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int n1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Suma: " + Operaciones.sumar(n1, n2));
        System.out.println("Resta: " + Operaciones.restar(n1, n2));
        System.out.println("Multiplicación: " + Operaciones.multiplicar(n1, n2));
        
        sc.close();
    }
}
