package ejer3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    //Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        System.out.println("Universidad '" + nombre + "' creada.");
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    //Agregar profesor
    public void agregarProfesor(Profesor profesor) {
        if (profesor != null && !profesores.contains(profesor)) {
            profesores.add(profesor);
            System.out.println("Profesor agregado: " + profesor.getNombre());
        }
    }

    //Agregar curso
    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
            System.out.println("Curso agregado: " + curso.getNombre());
        }
    }

    //Asignar profesor a curso
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("Error: Curso con código '" + codigoCurso + "' no encontrado.");
            return;
        }

        if (profesor == null) {
            System.out.println("Error: Profesor con ID '" + idProfesor + "' no encontrado.");
            return;
        }
        curso.setProfesor(profesor);
    }

    //Listar profesores
    public void listarProfesores() {
        System.out.println("\n=== LISTA DE PROFESORES ===");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }

        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }

    //Listar cursos
    public void listarCursos() {
        System.out.println("\n=== LISTA DE CURSOS ===");
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }

        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }

    //Buscar profesor por ID
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }

    //Buscar curso por código
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }

    //Eliminar curso
    public void eliminarCurso(String codigo) {
        Iterator<Curso> iterator = cursos.iterator();
        while (iterator.hasNext()) {
            Curso curso = iterator.next();
            if (curso.getCodigo().equals(codigo)) {
                if (curso.getProfesor() != null) {
                    curso.getProfesor().eliminarCurso(curso);
                }
                iterator.remove();
                System.out.println("Curso eliminado: " + curso.getNombre());
                return;
            }
        }
        System.out.println("Curso con código '" + codigo + "' no encontrado.");
    }

    // 9. Eliminar profesor
    public void eliminarProfesor(String id) {
        Iterator<Profesor> iterator = profesores.iterator();
        while (iterator.hasNext()) {
            Profesor profesor = iterator.next();
            if (profesor.getId().equals(id)) {
                for (Curso curso : new ArrayList<>(profesor.getCursos())) {
                    curso.setProfesor(null);
                }
                iterator.remove();
                System.out.println("Profesor eliminado: " + profesor.getNombre());
                return;
            }
        }
        System.out.println("Profesor con ID '" + id + "' no encontrado.");
    }

    //Reporte: cantidad de cursos por profesor
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n=== REPORTE: CURSOS POR PROFESOR ===");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }

        for (Profesor profesor : profesores) {
            System.out.println(profesor.getNombre() + ": " + profesor.getCantidadCursos() + " cursos");
        }
    }
}
