package Semana4.Actividad3.Actividad3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        
        System.out.println("=============================================================");
        System.out.println("- - - Sistema de Registro de Productos - - -");
        System.out.println("=============================================================");
        
        System.out.println("\n=============================================================");
        System.out.println("--- PRODUCTO 1 ---");
        capturarDatosProducto(sc, producto1);
        
        System.out.println("\n=============================================================");
        System.out.println("--- PRODUCTO 2 ---");
        capturarDatosProducto(sc, producto2);
        
        System.out.println("\n=============================================================");
        System.out.println("- - - Productos Registrados - - -");
        System.out.println("=============================================================");
        System.out.println("\nPRODUCTO 1:");
        producto1.muestraProducto();
        
        System.out.println("\nPRODUCTO 2:");
        producto2.muestraProducto();
        
        double utilidad = 0;
        boolean entradaValida = false;
        
        while (!entradaValida) {
            try {
                System.out.print("\nIngrese el porcentaje de utilidad a aplicar: ");
                utilidad = sc.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                sc.nextLine();
            }
        }
        
        String resultado = compararProductos(producto1, producto2, utilidad);
        
        System.out.println("\n=============================================================");
        System.out.println("- - - Comparación de Productos - - -");
        System.out.println("=============================================================");
        System.out.println(resultado);
        System.out.println("=============================================================");
        
        sc.close();
    }
    
    public static void capturarDatosProducto(Scanner sc, Producto producto) {
        System.out.print("Ingrese la descripción: ");
        String descripcion = sc.nextLine();
        producto.setDescripcion(descripcion);
        
        System.out.print("Ingrese el código: ");
        String codigo = sc.nextLine();
        producto.setCodigo(codigo);
        
        System.out.print("Ingrese el tipo: ");
        String tipo = sc.nextLine();
        producto.setTipo(tipo);
        
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print("Ingrese el costo: $");
                Double costo = sc.nextDouble();
                producto.setCosto(costo);
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                sc.nextLine(); 
            }
        }
        
        entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print("Ingrese el porcentaje de impuesto: ");
                Double impuesto = sc.nextDouble();
                producto.setImpuesto(impuesto);
                entradaValida = true;
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                sc.nextLine(); 
            }
        }
    }
    
    public static String compararProductos(Producto p1, Producto p2, double utilidad) {
        double precioVenta1 = p1.calcularPrecio(utilidad);
        double precioVenta2 = p2.calcularPrecio(utilidad);
        
        String resultado = "Precio de venta de '" + p1.getDescripcion() + "': $" + 
                          String.format("%.2f", precioVenta1) + "\n";
        resultado += "Precio de venta de '" + p2.getDescripcion() + "': $" + 
                    String.format("%.2f", precioVenta2) + "\n\n";
        
        if (precioVenta1 > precioVenta2) {
            resultado += "El producto con mayor precio de venta es: " + p1.getDescripcion();
        } else if (precioVenta2 > precioVenta1) {
            resultado += "El producto con mayor precio de venta es: " + p2.getDescripcion();
        } else {
            resultado += "Ambos productos tienen el mismo precio de venta.";
        }
        
        return resultado;
    }
}