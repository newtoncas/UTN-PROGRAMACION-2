package tp.pkg2.prog.estructurada;
import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar el stock actual 
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(sc.nextLine());

        // Solicitar cantidad vendida
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(sc.nextLine());

        // Solicitar cantidad reibida
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(sc.nextLine());
        
        int stockProducto = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " +stockProducto);
        
        sc.close();
    }
    //Metodo para actualizar el stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
