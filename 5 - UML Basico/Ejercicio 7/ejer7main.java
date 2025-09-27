package ejer7;
public class ejer7main {

    public static void main(String[] args) {
        
        //Creacion de objetos
        Motor motor = new Motor("Gasolina", "XYZ12345");
        Conductor conductor = new Conductor("Cristian Serna", "38813749");
        Vehiculo vehiculo = new Vehiculo("ABC 123", "Renault", motor, conductor);

        // --- Verificación de las relaciones ---

        System.out.println("--- Datos del Vehículo ---");
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Modelo: " + vehiculo.getModelo());

        System.out.println("\n--- Datos del Motor ---");
        System.out.println("Tipo de motor: " + vehiculo.getMotor().getTipo());
        System.out.println("Número de serie del motor: " + vehiculo.getMotor().getNumeroSerie());

        System.out.println("\n--- Datos del Conductor ---");
        System.out.println("El vehículo pertenece a: " + vehiculo.getConductor().getNombre());
        System.out.println("Licencia del conductor: " + vehiculo.getConductor().getLicencia());
        System.out.println("El conductor " + conductor.getNombre() + " tiene el vehículo con patente: " + conductor.getVehiculo().getPatente());
    }
}