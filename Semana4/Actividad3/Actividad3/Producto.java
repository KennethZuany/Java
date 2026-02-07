package Semana4.Actividad3.Actividad3;

public class Producto {
    private String descripcion;
    private String codigo;
    private String tipo;
    private Double costo;
    private Double impuesto;
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public Double getCosto() {
        return costo;
    }
    
    public Double getImpuesto() {
        return impuesto;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setCosto(Double costo) {
        this.costo = costo;
    }
    
    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }
    
    public void muestraProducto() {
        System.out.println("=============================================================");
        System.out.println("- - - Información del Producto - - -");
        System.out.println("=============================================================");
        System.out.println("Descripción: " + descripcion);
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: $" + costo);
        System.out.println("Impuesto: " + impuesto + "%");
        System.out.println("=============================================================");
    }
    
    public double calcularPrecio(double utilidad) {
        double precioConUtilidad = costo + (costo * (utilidad / 100));
        
        double montoImpuesto = precioConUtilidad * (impuesto / 100);
        
        double precioVenta = precioConUtilidad + montoImpuesto;
        
        return precioVenta;
    }
}