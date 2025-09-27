package tp5.ejer1;

public class Titular {
private String nombre;
    private String dni;
    // Referencia al Pasaporte 
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }
}