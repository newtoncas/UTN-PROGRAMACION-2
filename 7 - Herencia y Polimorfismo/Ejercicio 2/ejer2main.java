package ejer2;
public class ejer2main {

    public static void main(String[] args) {
        // Se crea el array de lfiguras , en este caso una de circulo y otra de rectangulo
        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo(5.0);
        figuras[1] = new Rectangulo(4.0, 6.0);
        
        // Mostrar área de cada figura usando polimorfismo
        System.out.println("Calculando areas de diferentes figuras:\n");
        for (Figura figura : figuras) {
            figura.mostrarInformacion();
            System.out.println();
        }
    }

}
