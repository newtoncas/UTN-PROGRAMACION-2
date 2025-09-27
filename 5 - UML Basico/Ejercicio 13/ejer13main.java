package ejer13;
public class ejer13main {

    public static void main(String[] args) {
        
        //Creacion de objetos
        Usuario usuario = new Usuario("Cristian", "cristian@gmail.com");
        GeneradorQR generador = new GeneradorQR();

        // --- Verificación de las relaciones ---        
        System.out.println("--- Generación de Codigo Qr ---");
        CodigoQR codigoGenerado = generador.generar("www.tup.com.ar", usuario);
 
    }
}