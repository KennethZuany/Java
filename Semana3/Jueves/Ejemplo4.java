package Semana3.Jueves;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo4 {
    public static void main(String[] args) {
        try {
            FileReader archivo = new FileReader("archivo.txt");
            System.out.println("Archivo abierto correctamente.");
        }   catch   (IOException e) {
            System.out.println("Error: el archivo no existe");
        }
    }
}
