package ejer3;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    //Constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    //Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    //Set profesor con sincronización bidireccional 
    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor == nuevoProfesor) {
            return; // No hacer nada si no hay cambio
        }

        // Si tenía profesor antes, quitar este curso de su lista sin volver a llamar a setProfesor
        if (this.profesor != null) {
            Profesor profesorAnterior = this.profesor;
            this.profesor = null;
            profesorAnterior.eliminarCurso(this);
        }

        // Asignar el nuevo profesor
        this.profesor = nuevoProfesor;

        // Agregar este curso a la lista del nuevo profesor, si no es null
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.agregarCurso(this);
        }
    }

    //Mostrar información del curso
    public void mostrarInfo() {
        System.out.println("\n--- INFORMACIÓN DEL CURSO ---");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar"));
    }

    @Override
    public String toString() {
        return String.format("Curso[Código: %s, Nombre: %s, Profesor: %s]",
                codigo, nombre, profesor != null ? profesor.getNombre() : "Sin asignar");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Curso curso = (Curso) obj;
        return codigo.equals(curso.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
}
