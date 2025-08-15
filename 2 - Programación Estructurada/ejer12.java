package tp.pkg2.prog.estructurada;

public class ejer12 {

    public static void main(String[] args) {

        //Se declara e inicializa la array con los precios
        double[] preciosOriginales = {199.99, 299.5, 149.75, 399.0, 89.99};

        //Se muestra todos los precios sin modificar de la array 
        System.out.println("Precios originales: ");
        mostrarPrecios(preciosOriginales);

        //Se modifica el 3er precio de la array
        preciosOriginales[2] = 129.99;

        //Se muestra todos los precios modificados de la array 
        System.out.println("Precios modificados: ");
        mostrarPrecios(preciosOriginales);

    }

    //Metodo iterativo para mostrar todos los precios de la array
    public static void mostrarPrecios(double[] precios) {
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
