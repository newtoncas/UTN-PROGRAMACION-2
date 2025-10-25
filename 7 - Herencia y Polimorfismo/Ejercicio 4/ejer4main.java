package ejer4;
import java.util.ArrayList;
import java.util.List;
public class ejer4main {

    public static void main(String[] args) {
        // Se crea una lista para almacenar diferentes animales.
        List<Animal> animales = new ArrayList<>();

        // Se instancian los animales y se agregan a la lista (Upcasting implícito)
        animales.add(new Perro("Tequila"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Milanesa"));

        // Se muestra los sonidos de los animales con polimorfismo
        System.out.println("\n--- Demostracion de Sonido con Polimorfismo ---");
        System.out.println("\n");
        for (Animal animal : animales) {
            animal.describirAnimal(); 
            animal.hacerSonido(); 
            System.out.println("\n");
        }
    }
}