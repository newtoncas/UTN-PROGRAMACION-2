package tp8.Parte1;
public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificarCambioEstado() {
        // Implementación vacía - el cliente recibe notificaciones a través de recibirNotificacion
    }

    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación para " + nombre + " (" + email + "): " + mensaje);
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
}