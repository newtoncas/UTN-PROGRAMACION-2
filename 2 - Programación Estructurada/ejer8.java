package tp.pkg2.prog.estructurada;
import java.util.Scanner;

public class ejer8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el precio base
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        // Solicitar el porcentaje de impuesto
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuestoPorcentaje = sc.nextDouble();

        // Solicitar el porcentaje de descuento
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuentoPorcentaje = sc.nextDouble();

        // Convertir porcentajes a decimales
        double impuesto = impuestoPorcentaje / 100.0;
        double descuento = descuentoPorcentaje / 100.0;

        // Llamar al método y obtener el precio final
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostrar el resultado
        System.out.println("El precio final del producto es: " + precioFinal);

        sc.close();
    }
    // Metodo para calcular el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
}
