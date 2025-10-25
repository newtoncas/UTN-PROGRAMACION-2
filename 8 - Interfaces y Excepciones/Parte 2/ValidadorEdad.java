package tp8.Parte2;
public class ValidadorEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad " + edad + " no es válida. Debe estar entre 0 y 120");
        }
    }

    public static void main(String[] args) {
        try {
            validarEdad(25);  // Válido
            validarEdad(-5);  // Inválido
            validarEdad(150); // Inválido
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
