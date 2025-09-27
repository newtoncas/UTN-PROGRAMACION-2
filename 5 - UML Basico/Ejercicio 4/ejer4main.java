package ejer4;

public class ejer4main {

    public static void main(String[] args) {
        
        // Creacion de objetos
        Banco banco = new Banco("MAcro", "30-94731883-9");
        Cliente cliente = new Cliente("Cristian Serna", "94731883");
        Tarjeta tarjeta = new Tarjeta("1234567890", "12/26", banco, cliente);

        // --- Verificación de las relaciones ---
        System.out.println("--- Información de la Tarjeta ---");
        System.out.println("Número de Tarjeta: " + tarjeta.getNumero());
        System.out.println("Fecha de Vencimiento: " + tarjeta.getFechaVencimiento());

        System.out.println("\n--- Información del Banco ---");
        System.out.println("Banco emisor: " + tarjeta.getBanco().getNombre());
        System.out.println("CUIT del banco: " + tarjeta.getBanco().getCuit());

        System.out.println("\n--- Información del Cliente ---");
        System.out.println("La tarjeta pertenece al cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("DNI del cliente: " + tarjeta.getCliente().getDni());
        System.out.println("El cliente " + cliente.getNombre() + " tiene la tarjeta con número: " + cliente.getTarjeta().getNumero());
    }
}
