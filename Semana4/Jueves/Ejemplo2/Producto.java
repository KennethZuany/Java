package Semana4.Jueves.Ejemplo2;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio);
    }

    public static void main(String[] args) {
        Producto prod1 = new Producto("Laptop", 999.99);
        prod1.mostrarInfo();
    }
}
