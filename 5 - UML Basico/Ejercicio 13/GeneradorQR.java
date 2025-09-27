package ejer13;

public class GeneradorQR {

    public CodigoQR generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario);
        
        // Información del proceso de generacion de QR
        System.out.println("Valor del QR: " + codigo.getValor());
        System.out.println("Usuario asociado: " + codigo.getUsuario().getNombre());
        System.out.println("Email del usuario: " + codigo.getUsuario().getEmail());
        System.out.println("Código QR generado exitosamente!");
        
        return codigo;
    }
}
