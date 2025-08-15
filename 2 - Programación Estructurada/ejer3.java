package tp.pkg2.prog.estructurada;
import java.util.Scanner;

public class ejer3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        
        //Soliciar la edad al usuario
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(sc.nextLine());
        
        //Estructura condicional para evaluar la edad y clasificar etapa de vida
        if (edad < 12) {
            System.out.println("Eres un Niño");

        } else if (edad < 18) {
            System.out.println("Eres un Adolescente");

        } else if (edad < 60) {
            System.out.println("Eres un Adulto");

        } else {
            System.out.println("Eres un Adulto mayor");
        }
        sc.close();
    }
}

