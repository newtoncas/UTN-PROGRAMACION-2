package tp.pkg2.prog.estructurada;
import java.util.Scanner;

public class ejer4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion e inicializacion de variables
        double precioFinal = 0.0;
        int descuento = 0;

        //Solicitar el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precioInicial = sc.nextDouble();

        //Solicitar la categoria del producto
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        char categoria = sc.next().charAt(0);

        //Estructura condicional para verificar categoria y descuento
        switch (categoria) {
            case 'A':
            case 'a':
                precioFinal = precioInicial * 0.9;
                descuento = 10;
                break;

            case 'B':
            case 'b':
                precioFinal = precioInicial * 0.85;
                descuento = 15;
                break;

            case 'C':
            case 'c':
                precioFinal = precioInicial * 0.8;
                descuento = 20;
                break;

            default:
                System.out.println("Categoria inválida");
        }
        //Mostrar el desceunto aplicado y el precio final
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}
