package tp.pkg2.prog.estructurada;
import java.util.Scanner;

public class ejer1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio;

        //Se solicita un año
        System.out.print("Ingrese el año: ");
        anio = Integer.parseInt(sc.nextLine());

        //Estructura condicional para evaluar si el año es bisiesto
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }
}
