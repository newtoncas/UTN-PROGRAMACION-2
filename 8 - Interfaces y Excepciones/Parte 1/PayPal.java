package tp8.Parte1;
public class PayPal implements Pago {
    private String email;
    private String nombreUsuario;

    public PayPal(String email) {
        this.email = email;
        this.nombreUsuario = email.split("@")[0]; // Extraer nombre del email
    }

    public PayPal(String email, String nombreUsuario) {
        this.email = email;
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("🔗 Procesando pago de $" + String.format("%.2f", monto) + 
                          " con PayPal");
        System.out.println("Usuario: " + nombreUsuario + " (" + email + ")");
        System.out.println("✅ Pago con PayPal procesado exitosamente");
    }

    // Getters
    public String getEmail() { return email; }
    public String getNombreUsuario() { return nombreUsuario; }
}