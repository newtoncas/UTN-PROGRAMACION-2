package tp8.Parte2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResources {

    public static void main(String[] args) {
        String nombreArchivo = "datos.txt";
        
        // try-with-resources cierra automáticamente el BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        // No es necesario finally - el recurso se cierra automáticamente
    }
}