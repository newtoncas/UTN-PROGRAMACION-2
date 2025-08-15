package tp.pkg2.prog.estructurada;
import java.util.Scanner;

public class ejer9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el precio 
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        // Solicitar el peso del paquete
        System.out.print("Ingrese el peso del paquete en Kg: ");
        double pesoPaquete = sc.nextDouble();

        // Solicitar zona de envio
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zonaEnvio = sc.next();

        //Verificacion de que la zona ingresada es válida 
        if (zonaEnvio.equalsIgnoreCase("Nacional") || zonaEnvio.equalsIgnoreCase("Internacional")) {
            
            //se llama al metodo para calcular el costo del envio y el total de la compra
            double costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvio);
            double totalPagar = calcularTotalCompra(precioProducto, costoEnvio);
            
            //Se muestra el costo del envio y el total de la compra
            System.out.println("El costo del envío es: " + costoEnvio);
            System.out.println("El total a pagar es: " + totalPagar);
        } else {
            System.out.println("Zona no válida."); //Zona ingresada inválida
        }
        sc.close();
    }
    //Metodo para calcular el costo delenvio
    public static double calcularCostoEnvio(double peso, String zona) {
        
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else {
            return peso * 10;
        }
    }
    //Metodo para calcular el precio total 
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
