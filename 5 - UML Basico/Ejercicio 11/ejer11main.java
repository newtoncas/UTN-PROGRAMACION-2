package ejer11;
public class ejer11main {

    public static void main(String[] args) {
        
        // Creacion de objetos
        Artista artista = new Artista("Queen", "Rock");
        Cancion cancion = new Cancion("Bohemian Rhapsody", artista);
        Reproductor reproductor = new Reproductor();
        
        // --- Verificación de las relaciones ---

        System.out.println("--- Info Canción ---");
        System.out.println("Título de la canción: " + cancion.getTitulo());
        System.out.println("Artista de la canción: " + cancion.getArtista().getNombre());
        System.out.println("Género del artista: " + cancion.getArtista().getGenero());
        
        System.out.println("\n--- Reproductor ---");
        reproductor.reproducir(cancion);
    }
}