package ejer12;

public class Calculadora {

    public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            System.out.println("Impuesto de $" + impuesto.getMonto() + " para el contribuyente: " + impuesto.getContribuyente().getNombre());
        } else {
            System.out.println("No hay un impuesto para calcular.");
        }
    }
}