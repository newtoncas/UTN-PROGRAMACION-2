package ejer11;

public class Reproductor {

    public void reproducir(Cancion cancion) {
        if (cancion != null) {
            System.out.println("Reproduciendo: '" + cancion.getTitulo() + "' de " + cancion.getArtista().getNombre());
        } else {
            System.out.println("No hay una canción para reproducir.");
        }
    }
}