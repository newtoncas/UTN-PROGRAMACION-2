package ejer1;

public class Producto {

    private String id;
    private String nombre;
    private double precio;
    public int cantidad;
    private CategoriaProducto categoria;

    //Contructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

     // Constructor sobrecargado 
    public Producto(String id, String nombre, double precio, CategoriaProducto categoria) {
        this(id, nombre, precio, 0, categoria);
    }
    
    //Getters 
    public String getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public CategoriaProducto getCategoria() {
        return this.categoria;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad no puede ser negativa.");
        }
    }
    
    //Metodo para mostrar la informacion de un producto
    public void mostrarInfo() {
        
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Categoria: " + categoria);
        System.out.println("Descripcion: " + categoria.getDescripcion());
        System.out.println("------------------------------");
    }

    //toString
    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=$" + String.format("%.2f", precio) +
                ", cantidad=" + cantidad +
                ", categoria=" + categoria +
                '}';
    }

}
