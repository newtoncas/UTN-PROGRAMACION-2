package ejer2;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    
    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }
    
    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Agregar Libro asociado a un autor
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println("'" + titulo + "' agregado a la biblioteca.");
    }
    
    //Listar libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca");
            return;            
        }
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
        
    }
    
    //Buscar libro por ISBN y mostrar info
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    //Filtrar y mosrar libros por año de publicación
    public void buscarLibroPorAnio(int anio) {
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == (anio)) {
                libro.mostrarInfo();
            }
        }
    }
    
    //Eliminar un libro por su ISBN
    public void eliminarLibroPorIsbn(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            System.out.println("\n*Libro con ISBN " + isbn + " ha sido eliminado correctamente de la biblioteca.\n");
        } else {
            System.out.println("\n*No se encontró un libro con ISBN " + isbn+ " en la biblioteca.");
        }        
    }
    
    //Cantidad total de libros en la biblioteca
    public int cantidadLibros(){
        return this.libros.size();
    }
    
    //Listar autores de los libros en la biblioteca
    public void mostrarAutores(){
        List<String> autoresMostrados = new ArrayList<>();
        for (Libro l : libros) {
            String autorNombre = l.getAutor().getNombre();
            if (!autoresMostrados.contains(autorNombre)) {
                l.getAutor().mostrarInfo();
                autoresMostrados.add(autorNombre);
            }
        }
    }
    
}
