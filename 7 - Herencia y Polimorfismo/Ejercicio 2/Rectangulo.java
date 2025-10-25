package ejer2;
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        super("Rectangulo"); // Llamar constructor de Figura
        this.base = base;
        this.altura = altura;
    }
    
    // Implementación obligatoria del método abstracto
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }
}