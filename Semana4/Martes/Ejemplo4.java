package Semana4.Martes;

public class Ejemplo4 {
    public static double calcularPromedio(double c1, double c2, double c3) {
        return (c1 + c2 + c3) / 3;
    }
    public static String determinarResultado(double promedio) {
        if (promedio >= 70) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
    public static void main(String[] args) {
        double promedio = calcularPromedio(85.5, 90.0, 78.5);
        String resultado = determinarResultado(promedio);
        System.out.println("El promedio es: " + promedio);
        System.out.println("El resultado es: " + resultado);
    }
}
