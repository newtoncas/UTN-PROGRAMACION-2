package tp3;

public class Ejer5 {

    public static void main(String[] args) {
        //Se crear la nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Starship", 50);

        //Mostrar estado inicial de la nave
        nave.mostrarEstado();

        //Despegue!
        nave.despegar();

        //La nave avanza 20 unidades correctamente
        nave.avanzar(20);
        nave.mostrarEstado();

        //La nave no puede avanzar 30 unidades porque no hay suficiente combustible
        nave.avanzar(30);

        //Recargar combustible a la nave 30 unidades
        nave.recargarCombustible(30);
        nave.mostrarEstado();

        //Recargar combustible en exceso 50 inicial + 70 agregados, no deberia de superar las 100 unidades de combustible
        nave.recargarCombustible(70);
        nave.mostrarEstado();
    }
}
