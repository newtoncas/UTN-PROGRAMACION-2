package tp8.Parte2;
import java.util.Scanner;
public class ConversionNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        String entrada = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + entrada + "' no es un número válido");
        } finally {
            scanner.close();
        }
    }
}