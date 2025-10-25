package ejer4;
public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre); // Llama al constructor de Animal
    }

    @Override // Indica que se está sobrescribiendo un método
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau! Guau!");
    }
}