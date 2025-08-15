package tp.pkg2.prog.estructurada;
import java.util.Scanner;

public class ejer5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion e inicializacion de variables
        int num, suma = 0;
        
        //Solicitar un numero al usuario hasta que ingrese 0
        System.out.print("Ingrese un número (0 para terminar): ");
        num = Integer.parseInt(sc.nextLine());
        
        //Estructura repetitiva para que el usuario ingrese varios numeros hasta que el numero sea 0
        while (num != 0) {

            if (num % 2 == 0) {
                suma += num;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            num = Integer.parseInt(sc.nextLine());
        }
        sc.close();
        System.out.println("La suma de los números pares es: " + suma);
    }
}
