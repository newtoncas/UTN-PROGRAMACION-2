package ejer3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    // Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    //Agregar curso con sincronización bidireccional
    public void agregarCurso(Curso curso) {
        if (curso == null) {
            return;
        }

        //Verificar si el curso ya está en la lista
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            System.out.println("Curso '" + curso.getNombre() + "' agregado al profesor " + nombre);
        }

        //Sincronizar el lado del curso
        if (curso.getProfesor() != this) {
            curso.setProfesor(this);
        }
    }

    //Eliminar curso con sincronización bidireccional
    public void eliminarCurso(Curso curso) {
        if (curso == null) {
            return;
        }

        if (cursos.remove(curso)) {
            System.out.println("Curso '" + curso.getNombre() + "' removido del profesor " + nombre);
        }

        //Sincronizar el lado del curso
        if (curso.getProfesor() == this) {
            curso.setProfesor(null);
        }
    }

    //Listar cursos del profesor
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor " + nombre + " no dicta ningún curso.");
            return;
        }

        System.out.println("\nCursos dictados por " + nombre + ":");
        for (Curso curso : cursos) {
            System.out.println("  - " + curso.getCodigo() + ": " + curso.getNombre());
        }
    }

    //Mostrar información completa del profesor
    public void mostrarInfo() {
        System.out.println("\n--- INFORMACIÓN DEL PROFESOR ---");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
        listarCursos();
    }

    //Obtener cantidad de cursos
    public int getCantidadCursos() {
        return cursos.size();
    }

    @Override
    public String toString() {
        return String.format("Profesor[ID: %s, Nombre: %s, Especialidad: %s, Cursos: %d]",
                id, nombre, especialidad, cursos.size());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Profesor profesor = (Profesor) obj;
        return id.equals(profesor.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
