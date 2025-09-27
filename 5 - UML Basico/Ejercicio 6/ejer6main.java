package ejer6;
public class ejer6main {

    public static void main(String[] args) {
        
        // Creacion de objetos
        Cliente cliente = new Cliente("Cristian Serna", "94731883");
        Mesa mesa = new Mesa(7, 4); // el primer parametro es el numero de la mesa, el segundo la cantidad de personas
        Reserva reserva = new Reserva("2025-10-26", "21:00", cliente, mesa);

        // --- Verificación de las relaciones ---

        System.out.println("--- Datos de la Reserva ---");
        System.out.println("Fecha de reserva: " + reserva.getFecha());
        System.out.println("Hora de reserva: " + reserva.getHora());

        System.out.println("\n--- Datos del Cliente ---");
        System.out.println("La reserva es para el cliente: " + reserva.getCliente().getNombre());
        System.out.println("Teléfono del cliente: " + reserva.getCliente().getTelefono());

        System.out.println("\n--- Verificación de la Agregación (Reserva -> Mesa) ---");
        System.out.println("La reserva es para la mesa número: " + reserva.getMesa().getNumero());
        System.out.println("Capacidad de la mesa: " + reserva.getMesa().getCapacidad() + " personas");
    }
}