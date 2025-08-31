package tp3;

public class Estudiante {

    String nombre;
    String apellido;
    String curso;
    double calificacion;

    //Método para mostrar los atributos
    void mostrarInfo() {
        System.out.println("\n--- Información del Estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    //Método para aumentar la calificación
    double subirCalificaciones(double puntos) {
        calificacion += puntos;
        return puntos;
    }
    
    //Método para disminuir la calificación
    double bajarCalificaciones(double puntos) {
        calificacion -= puntos;
        return puntos;
    }

}
