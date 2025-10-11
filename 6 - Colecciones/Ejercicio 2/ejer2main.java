package ejer2;

public class ejer2main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca");

        //Se crean 3 Autores
        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        autor1.mostrarInfo();
        Autor autor2 = new Autor("A2", "Jorge Luis Borges", "Argentina");
        autor2.mostrarInfo();
        Autor autor3 = new Autor("A3", "J.R.R Tolkien", "Británica");
        autor3.mostrarInfo();

        //Agregar 5 libros 
        System.out.println("\n--- LIBROS AGREGADOS A LA BIBLIOTECA ---");
        biblioteca.agregarLibro("978-01", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-02", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("978-03", "Ficciones", 1944, autor2);
        biblioteca.agregarLibro("978-04", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("978-05", "La Comunidad del Anillo", 1954, autor3);

        //Listar los libros con la info
        System.out.println("\n--- LISTA COMPLETA DE LIBROS ---");
        biblioteca.listarLibros();

        //Buscar un libro por su ISBN: 978-05
        System.out.println("\n--- BUSQUEDA DE LIBRO POR ISBN ---");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("978-05");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        //Filtrar y mostrar libros publicados en un año: 1944
        System.out.println("\n--- BUSQUEDA DE LIBRO POR AÑO ---");
        biblioteca.buscarLibroPorAnio(1944);

        //Eliminar un libro por su ISBN: 978-05
        System.out.println("\n--- ELIMINAR LIBRO POR ISBN ---");
        biblioteca.eliminarLibroPorIsbn("978-05");
        biblioteca.listarLibros();

        //Mostrar cantidad de libros en la biblioteca
        System.out.println("\n--- CANTIDAD TOTAL DE LIBROS ---");
        System.out.println("\nTotal de libros en la biblioteca: " + biblioteca.cantidadLibros());

        //Listar autores de los libros en la biblioteca
        System.out.println("\n--- AUTORES DE LIBROS DISPONIBLES ---");
        biblioteca.mostrarAutores();
    }

}
