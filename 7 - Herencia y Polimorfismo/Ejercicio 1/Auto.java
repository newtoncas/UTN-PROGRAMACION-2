
package Ejer1;
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    //Sobrescritura del metodo monstrarinfo
    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Cantidad de puertas: " + this.cantidadPuertas);
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    
    
    
    

}
