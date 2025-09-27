package ejer12;
public class ejer12main {

    public static void main(String[] args) {

        // Creación de los objetos
        Contribuyente contribuyente = new Contribuyente("Cristian Serna", "20-12345678-9");
        Impuesto impuesto = new Impuesto(5000.0, contribuyente);
        Calculadora calculadora = new Calculadora();
        
        // --- Verificación de las relaciones ---

        System.out.println("--- Impuesto - Contribuyente ---");
        System.out.println("Monto del impuesto: $" + impuesto.getMonto());
        System.out.println("Nombre del contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("CUIL del contribuyente: " + impuesto.getContribuyente().getCuil());

        System.out.println("\n--- Calculo de Impuesto ---");
        calculadora.calcular(impuesto);
    }
}