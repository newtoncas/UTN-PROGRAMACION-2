package tp.pkg2.prog.estructurada;
import java.util.Scanner;

public class ejer6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion e inicializacion de variables
        int positivos = 0, negativos = 0, ceros = 0;
        
        //Estructura iterativa para solicitar el ingreso de 10 numeros enteros
        for (int i = 1; i < 11; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int num = sc.nextInt();
            
            //Estructura condicional para evaluar que numeros son positivos, negativos o cero y acumularlos
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        sc.close();
        
        //Mostrar los resultados
        System.out.println("\nResultados: ");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
