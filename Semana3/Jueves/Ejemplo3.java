package Semana3.Jueves;

public class Ejemplo3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;  //División entre 0
        
        try{
            int resultado = a / b;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre 0.");
        }
    }
}
