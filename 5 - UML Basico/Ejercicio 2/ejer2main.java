package ejer2;

public class ejer2main {

    public static void main(String[] args) {
   
        // Creacion de objetos
        Bateria bateriaSamsung = new Bateria("Litio", 4500);
        Usuario usuario = new Usuario("Cristian Serna", "94731883");
        Celular celularSamsung = new Celular("012345", "Samsung", "S22 Ultra", bateriaSamsung, usuario);

        // --- Verificación de las relaciones ---
        System.out.println("--- Especificaciones del Celular ---");
        System.out.println("Marca: " + celularSamsung.getMarca());
        System.out.println("Modelo: " + celularSamsung.getModelo());
        System.out.println("IMEI: " + celularSamsung.getImei());

        System.out.println("\n--- Información de la Bateria ---");
        System.out.println("Modelo de la batería: " + celularSamsung.getBateria().getModelo());
        System.out.println("Capacidad de la batería: " + celularSamsung.getBateria().getCapacidad() + " mAh");

        System.out.println("\n--- Información del Titular del Celular ---");
        System.out.println("El celular pertenece a: " + celularSamsung.getUsuario().getNombre());
        System.out.println("El DNI del usuario es: " + celularSamsung.getUsuario().getDni());
        System.out.println("El usuario " + usuario.getNombre() + " tiene el celular con IMEI: " + usuario.getCelular().getImei());
    }
}
