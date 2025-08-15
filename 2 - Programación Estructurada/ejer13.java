package tp.pkg2.prog.estructurada;

public class ejer13 {

    public static void main(String[] args) {

        //Se declara e inicializa la array con los precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        //Se muestra todos los precios sin modificar de la array 
        System.out.println("Precios originales: ");
        mostrarPrecios(precios, 0);

        //Se modifica el 3er precio de la array
        precios[2] = 129.99;

        //Se muestra todos los precios modificados de la array 
        System.out.println("Precios modificados: ");
        mostrarPrecios(precios, 0);

    }
    //Metodo recursivo para mostrar todos los precios de la array
    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        System.out.println("precio: $" + precios[indice]);
        mostrarPrecios(precios, indice + 1);
    }
}
