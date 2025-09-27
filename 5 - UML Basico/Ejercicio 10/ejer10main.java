package ejer10;
public class ejer10main {

    public static void main(String[] args) {
        // Creación de objetos
        Titular titular = new Titular("Cristian Serna", "94731883");
        CuentaBancaria cuenta = new CuentaBancaria("0000003500000123456789", 50000.50, "1234xxxx", "26-05-2025", titular);
        
        // --- Verificación de las relaciones ---

        System.out.println("--- Cuenta Bancaria ---");
        System.out.println("CBU: " + cuenta.getCbu());
        System.out.println("Saldo: $" + cuenta.getSaldo());

        System.out.println("\n--- Clave de Seguridad ---");
        System.out.println("Código de seguridad: " + cuenta.getClaveSeguridad().getCodigo());
        System.out.println("Última modificación de la clave: " + cuenta.getClaveSeguridad().getUltimaModificacion());

        System.out.println("\n--- Datos del Cliente ---");
        System.out.println("La cuenta pertenece al titular: " + cuenta.getTitular().getNombre());
        System.out.println("El DNI del titular es: " + cuenta.getTitular().getDni());
        System.out.println("El titular " + titular.getNombre() + " tiene la cuenta con CBU: " + titular.getCuenta().getCbu());
    }
}