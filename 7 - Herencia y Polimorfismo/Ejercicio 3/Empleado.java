package ejer3;
public abstract class Empleado {
    protected String nombre;
    protected String id;

    // Constructor de la clase abstracta
    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Método abstracto para calcularsueldo
    public abstract double calcularSueldo();

    // Método para monstrarinfo
    public void mostrarInfoBasica() {
        System.out.printf("Empleado: %s (DNI: %s)\n", nombre, id);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getId() {
        return id;
    }
}