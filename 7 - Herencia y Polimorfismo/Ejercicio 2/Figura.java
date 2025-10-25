package ejer2;
public abstract class Figura {
    protected String nombre;
    
    // Constructor
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    // Método abstracto: debe ser implementado por subclases
    public abstract double calcularArea();
    
    // Método concreto: puede ser usado por todas las subclases
    public void mostrarInformacion() {
        System.out.println("Figura: " + nombre);
        System.out.println("Area: " + calcularArea() + " unidades");
    }
    
    public String getNombre() {
        return nombre;
    }
}