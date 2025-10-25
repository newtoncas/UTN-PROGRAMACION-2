package tp8.Parte1;
public class Producto implements Pagable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularTotal() {
        return precio;
    }

    // Getters
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}