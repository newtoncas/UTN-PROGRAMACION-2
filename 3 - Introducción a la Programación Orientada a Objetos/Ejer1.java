package tp3;

public class Ejer1 {

    public static void main(String[] args) {
        
        Estudiante est = new Estudiante();
        
        //Instanciar un estudiante
        est.nombre = "Cristian";
        est.apellido = "Serna";
        est.curso = "Programación 2";
        est.calificacion = 6;
        
        //Mostrar infromacion de los estudiantes
        est.mostrarInfo();
        
        //aumentar la calificación
        est.subirCalificaciones(3.0);

        // Disminuir la calificación
        est.bajarCalificaciones(2.5);
        
        System.out.println("\n ACTUALIZACIÓN DE CALIFICACIÓN");
        
        //Mostrar información actualizada
        est.mostrarInfo();
    }    
}
