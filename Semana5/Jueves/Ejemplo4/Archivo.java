package Semana5.Jueves.Ejemplo4;

public class Archivo {
    String nombre;

    public Archivo(String nombre)   {
        this.nombre = nombre;
        System.out.println("Archivo " + nombre + " abierto.");
    }

    public Archivo(Archivo a)   {
        this.nombre = a.nombre;
        System.out.println("Archivo " + nombre + " copiado.");
    }

    @Override
    protected void finalize() throws Throwable  {
        System.out.println("Archivo " + nombre + " cerrado.");
    }

    public static void main(String[] args) {
        Archivo a1 = new Archivo("documento.txt");
        Archivo a2 = new Archivo(a1);
        a1 = null;
        a2 = null;
        System.gc();
    }
}
