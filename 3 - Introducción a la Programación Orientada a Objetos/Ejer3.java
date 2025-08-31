package tp3;

public class Ejer3 {
    public static void main(String[] args) {
        
        //Creacion del libro
        Libro lib = new Libro("Rayuela", "Julio Cortaza", 1963);
        
        lib.mostrarInfo();
        
        // Intentar modificar el año con un valor No inválido
        System.out.println("\n-Intentando modificar el año de publicación a 1000");
        lib.setAnioPublicacion(1000);

        // Intentar modificar el año con un valor válido
        System.out.println("\n-Intentando modificar el año de publicación a 1990");
        lib.setAnioPublicacion(1990);

        // Mostrar la información final
        lib.mostrarInfo();                                   
    }
}


