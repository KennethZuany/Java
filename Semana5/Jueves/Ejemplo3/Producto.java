package Semana5.Jueves.Ejemplo3;

public class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto()   {
        nombre = "ND";
        precio = 0;
        cantidad = 0;
    }

    public Producto(String nombre, double precio)   {
        this.nombre = nombre;
        this.precio = precio;
        cantidad = 0;
    }

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void mostraProducto()    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
    }

    public static void main(String[] args) {
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();

        p1.mostraProducto();
        p2.mostraProducto();
        p3.mostraProducto();
    }   
}

