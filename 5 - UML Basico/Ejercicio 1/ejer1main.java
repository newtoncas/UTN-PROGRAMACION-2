package tp5.ejer1;

public class ejer1main {

    public static void main(String[] args) {
        
        // Creacion de objetos
        Titular titular = new Titular("Cristian Serna", "012345");
        Pasaporte pasaporte = new Pasaporte("P987654", "26-09-2026", "foto_juan.jpg", "jpeg", titular);

        // Verificación de la relación bidireccional desde el Titular
        System.out.println("--- Información de Pasaporte ---");
        System.out.println("El titular " + titular.getNombre() + " tiene el pasaporte con número: " + pasaporte.getNumero());
        System.out.println("El pasaporte con número " + pasaporte.getNumero() + " pertenece a: " + pasaporte.getTitular().getNombre());
        System.out.println("El pasaporte contiene una foto con formato: " + pasaporte.getFoto().getFormato());
    }
}
