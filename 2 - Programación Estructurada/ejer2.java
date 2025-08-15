package tp.pkg2.prog.estructurada;
import java.util.Scanner;

public class ejer2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int num1, num2, num3;
        
        //Se solicita 3 numeros
        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el tercer número: ");
        num3 = Integer.parseInt(sc.nextLine());
        
        //Estructura condicional para evaluar cual es el numero mayor y mostrarlo
        if ((num1 >= num2) && (num1 >= num3)) {
            System.out.println("El mayor es: " + num1);
        } else if ((num2 >= num1) && (num2 >= num3)) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
        sc.close();
    }
}
