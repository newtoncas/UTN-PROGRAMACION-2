package tp3;

public class Mascotas {
    String nombre;
    String especie;
    int edad;

    void mostrarInfo() {
        System.out.println("\n--- Información de la Mascota ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años\n");
    }

    void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ahora tiene" + edad + " años");
    }
}
