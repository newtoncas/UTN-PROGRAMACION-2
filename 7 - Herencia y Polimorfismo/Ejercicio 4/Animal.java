package ejer4;
public class Animal {
    protected String nombre; 

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método que será sobrescrito
    public void hacerSonido() {
        System.out.println(nombre + " no hace sonido.");
    }

    public void describirAnimal() {
        System.out.println("Nombre del animal: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }
}