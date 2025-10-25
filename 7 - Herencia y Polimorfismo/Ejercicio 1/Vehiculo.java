package Ejer1;
public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    //Metodo  para mostrar la informacion
    public void mostrarinfo(){
        System.out.println("--- INFORMACION DEL VEHICULO---");
        System.out.println("Marca del vehiculo: " + this.marca); 
        System.out.println("Modelo del vehiculo: " + this.modelo);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    
            

}
