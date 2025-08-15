package tp.pkg2.prog.estructurada;
import java.util.Scanner;

public class ejer11 {

    public static final double DESCUENTO_GLOBAL = 0.10; //Declaracion de la variable global
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        //Calcular y mostrar el descuento y el precio final con el descuento aplicado
        calcularDescuentoEspecial(precioProducto);
        
        sc.close();
    }
    //Metodo para calcular el descuento aplicado y el precio final
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_GLOBAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
