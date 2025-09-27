package ejer5;
public class ejer5main {

    public static void main(String[] args) {
        
        // Creacion de objetos
        Propietario propietario = new Propietario("Cristian Serna", "94731883");
        Computadora compu = new Computadora("Sony", "0123456", "Ascr", "Intel 123", propietario);
        
        // --- Verificación de las relaciones ---

        System.out.println("--- Verificación de datos de la Computadora ---");
        System.out.println("Marca: " + compu.getMarca());
        System.out.println("Número de Serie: " + compu.getNumeroSerie());

        System.out.println("\n--- Verificación de la Composición (Computadora -> PlacaMadre) ---");
        System.out.println("Modelo de la Placa Madre: " + compu.getPlacaMadre().getModelo());
        System.out.println("Chipset de la Placa Madre: " + compu.getPlacaMadre().getChipset());

        System.out.println("\n--- Verificación de la Asociación Bidireccional ---");
        System.out.println("La computadora pertenece a: " + compu.getPropietario().getNombre());
        System.out.println("El DNI del propietario es: " + compu.getPropietario().getDni());
        System.out.println("El propietario " + propietario.getNombre() + " tiene la computadora con marca: " + propietario.getComputadora().getMarca());
    }
}