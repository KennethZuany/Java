package Semana5.Jueves.Ejemplo1;

public class Alumno {
    String nombre;
    int edad;

    public Alumno() {
        nombre = "Sin nombre";
        edad = 0;
    }

    public void mostrarDatos()  {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        a1.mostrarDatos();
    }
}
