package tp3;

public class NaveEspacial {

    private static final int COMBUSTIBLE_MAXIMO = 100;
    private String nomNave;
    private int combustible, distancia = 0;

    //Constructor
    public NaveEspacial(String nomNave, int combustible) {
        this.nomNave = nomNave;
        this.combustible = combustible;
    }

    //Método para Despegar. Tiene un costo de 10 unidades de combustible
    public void despegar() {
        if (combustible >= 10) {
            System.out.println(nomNave + " ha despegado!\n");
            combustible -= 10;
        } else {
            System.out.println(nomNave + " no tiene suficiente combustible");
        }

    }

    //Método para Avanzar
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            this.distancia += distancia; //Acumulador de distancia
            System.out.println(nomNave + " ha avanzado " + distancia + " unidades");
        } else {
            System.out.println(nomNave + " no tiene suficiente combustible para avanzar: " +distancia+ ". (Combustible disponible: " + combustible + ")\n");
        }
    }

    //Método para Recargar Combustible
    public void recargarCombustible(int cantidad) {
        if (cantidad + combustible <= COMBUSTIBLE_MAXIMO) {
            combustible += cantidad;
            System.out.println(nomNave + " ha recargado " + cantidad + " unidades de combustible");
        } else {
            combustible = COMBUSTIBLE_MAXIMO;
            System.out.println("Recarga excede el límite máximo. Combustible establecido en " + COMBUSTIBLE_MAXIMO + "unidades de combustible");
        }
    }

    //Método para mostrar el Estado
    public void mostrarEstado() {
        System.out.println("\n***Estado de la Nave  ***");
        System.out.println("- Nombre de la Nave: " + nomNave);
        System.out.println("- Combustible actual: " + combustible);
        System.out.println("- Distancia recorrida: " + distancia);
        System.out.println("******************************\n");
    }
}
