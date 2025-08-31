package tp3;

public class Gallina {

    private int idGallina, edad = 1, huevosPuestos;
    private static int contadorId = 1;

    //Constructor
    public Gallina(int idGallina) {
        this.idGallina = contadorId++;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    //Método para Poner un huevo
    public void ponerHuevo() {
        this.huevosPuestos++;
        System.out.println("La gallina " + this.idGallina + " ha puesto un huevo. Total de huevos: " + this.huevosPuestos);
    }

    //Método para Envejecer
    public void envejecer() {
        this.edad++;
        System.out.println("La gallina " + this.idGallina + " ha envejecido. Su nueva edad es: " + this.edad + " años");
    }
    //Mostrar estado de la gallina

    public void mostrarEstado() {
        System.out.println("\n***Estado de la Gallina " + this.idGallina + " ***");
        System.out.println("- ID: " + this.idGallina);
        System.out.println("- Edad: " + this.edad + " años");
        System.out.println("- Huevos puestos: " + this.huevosPuestos);
        System.out.println("******************************\n");
    }
}
