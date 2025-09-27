package ejer3;

public class ejer3main {

    public static void main(String[] args) {

        // Creacion de objetos
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Sudamericana", "Av. de Mayo 560");
        Libro libro = new Libro("Cien años de soledad", "978-0307474479", autor, editorial);

        // --- Verificación de las relaciones ---
        System.out.println("--- Información del Libro ---");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getIsbn());

        System.out.println("\n--- Información del Autor ---");
        System.out.println("El autor es: " + libro.getAutor().getNombre());
        System.out.println("Nacionalidad del autor: " + libro.getAutor().getNacionalidad());

        System.out.println("\n--- Información de la Editorial ---");
        System.out.println("La editorial es: " + libro.getEditorial().getNombre());
        System.out.println("Dirección de la editorial: " + libro.getEditorial().getDireccion());
    }
}
