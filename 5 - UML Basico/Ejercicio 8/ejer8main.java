package ejer8;
public class ejer8main {

    public static void main(String[] args) {
        // Creacion de objetos
        Usuario usuario = new Usuario("Cristian Serna", "cristianserna@gmail.com");
        Documento documento = new Documento("Contrato Laboral", " ... ", "HASH12345", "26-09-2025", usuario);

        // --- Verificación de las relaciones ---

        System.out.println("--- Informacion del Documento ---");
        System.out.println("Título: " + documento.getTitulo());
        System.out.println("Contenido: " + documento.getContenido());

        System.out.println("\n--- Datos de la Firma Digital ---");
        System.out.println("Código Hash de la firma: " + documento.getFirmaDigital().getCodigoHash());
        System.out.println("Fecha de la firma: " + documento.getFirmaDigital().getFecha());

        System.out.println("\n--- Datos del usuario ---");
        System.out.println("La firma pertenece al usuario: " + documento.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Email del usuario: " + documento.getFirmaDigital().getUsuario().getEmail());
    }
}