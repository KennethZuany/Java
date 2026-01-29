package Semana3.Jueves;
public class Ejemplo1 {
    public static void main(String[] args) {
        int edad = 25;
        if (edad >= 10 || edad <= 30)   {   //En vez de "||" debe ser "&&"
            System.out.println("Edad dentro del rango");
        }
    }
}
