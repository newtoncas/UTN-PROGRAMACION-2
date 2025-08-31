package tp3;

public class Ejer4 {

    public static void main(String[] args) {
        //Creacion de las 2 gallinas
        Gallina gallina1 = new Gallina(1);
        Gallina gallina2 = new Gallina(2);

        //Simulación de la primera Gallina
        System.out.println("***Acciones Simuladas - Primera Gallina*** ");
        gallina1.ponerHuevo();      //La primera gallina puso 4 huevos
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();       //La primera gallina envejeció 1 año
        gallina1.mostrarEstado();

        //Simulación de la segunda Gallina
        System.out.println("***Acciones Simuladas - Segunda Gallina*** ");
        gallina2.ponerHuevo(); //La segunda gallina puso 1 huevo
        gallina2.envejecer(); //La segunda gallina envejeció 3 años
        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.mostrarEstado();
    }
}
