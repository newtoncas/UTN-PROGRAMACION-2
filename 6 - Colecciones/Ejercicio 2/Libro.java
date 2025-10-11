package ejer2;
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;        //Asociacion del libro con el Autor
    
    //Contructor
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    //Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public Autor getAutor(){
        return this.autor;
    }
     
    //Metodo para mostrar la informacion
    public void mostrarInfo(){
        System.out.println("------------------------------");
        //System.out.println("     INFORMACION DEL LIBRO    ");
        System.out.println("ISBN: "+this.isbn);
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Año de publicación: "+this.anioPublicacion);
        System.out.println("Autor: "+this.autor.getNombre());
        System.out.println("------------------------------");
    }
    
    //ToString
    @Override
    public String toString() {
        return "\"" + this.titulo + "\" (" + this.anioPublicacion + ") - " + this.autor.getNombre();
    }
}
