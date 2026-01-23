import java.util.Scanner;

// Clase Coche
class Coche {
    // Atributos
    String marca;
    String modelo;
    int año;
    
    // Método para mostrar información
    void mostrarInformacion() {
        System.out.println("\n=== INFORMACIÓN DEL COCHE ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}

// Clase principal
public class RegistroCoche {
    public static void main(String[] args) {
        // Crear Scanner para leer datos
        Scanner entrada = new Scanner(System.in);
        
        // Crear objeto de tipo Coche
        Coche miCoche = new Coche();
        
        // Solicitar información al usuario
        System.out.println("=== REGISTRO DE COCHE ===\n");
        
        System.out.print("Ingrese la marca: ");
        miCoche.marca = entrada.nextLine();
        
        System.out.print("Ingrese el modelo: ");
        miCoche.modelo = entrada.nextLine();
        
        System.out.print("Ingrese el año: ");
        miCoche.año = entrada.nextInt();
        
        // Mostrar la información usando el método del objeto
        miCoche.mostrarInformacion();
        
        // Cerrar el scanner
        entrada.close();
    }
}