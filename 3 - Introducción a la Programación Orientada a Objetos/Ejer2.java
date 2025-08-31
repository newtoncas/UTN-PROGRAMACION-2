package tp3;

public class Ejer2 {
    public static void main(String[] args) {
        
        Mascotas masc = new Mascotas();
        
        masc.nombre = "Firulais";
        masc.especie = "Perro";
        masc.edad = 6;
        
        
        //Mostrar infromacion de la mascota
        masc.mostrarInfo();
        
        //Simulacion de cumplir años
        masc.cumplirAnios();        
    }
}
