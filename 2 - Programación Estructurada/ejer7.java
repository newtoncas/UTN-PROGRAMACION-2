package tp.pkg2.prog.estructurada;
import java.util.Scanner;

public class ejer7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            // Solicitar una nota 
            System.out.print("Ingrese una nota (0-10): "); 
            nota = Integer.parseInt(sc.nextLine());
            
            // Verificar si la nota es invalida
            if (nota < 0 || nota > 10) { 
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota < 0 || nota > 10);
        //Confirmar nota guardada correctamente
        System.out.println("Nota guardada coorrectamente "); 
        sc.close();    
    }
}
