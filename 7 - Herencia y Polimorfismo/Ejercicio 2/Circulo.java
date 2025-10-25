package ejer2;
public class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio) {
        super("Circulo"); // Llamar constructor de Figura
        this.radio = radio;
    }
    
    // Implementación obligatoria del método abstracto
    @Override
    public double calcularArea() {
        return 3.1416 * radio * radio;
    }
    
    public double getRadio() {
        return radio;
    }
}
