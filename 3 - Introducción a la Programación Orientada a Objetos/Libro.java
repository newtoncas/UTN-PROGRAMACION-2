package tp3;

public class Libro {
    //Atributos privados
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    //Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        // Usar el setter para validar desde el constructor
        setAnioPublicacion(anioPublicacion);
    }
    
    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    //Setter con validación. 
    //Mayor al año 1300 cuando se inventa la imprenta y menor o igual que 2025 año actual
    public void setAnioPublicacion(int anioPublicacion){
        if (anioPublicacion > 1300  && anioPublicacion <= 2025){
            this.anioPublicacion = anioPublicacion;
        }else{
            System.out.println("ERROR: Año ingresado inválido!");
        }
    }
        
    public void mostrarInfo() {
        System.out.println("---Información del Libro:---");
        System.out.println("* Título: " + titulo);
        System.out.println("* Autor: " + autor);
        System.out.println("* Año de publicación: " + anioPublicacion);
    } 
}
