package ejer3;

public class ejer3main {

    public static void main(String[] args) {
        System.out.println("--- SISTEMA ACADÉMICO UNIVERSITARIO ---\n");

        //Crear una universidad
        Universidad universidad = new Universidad("Universidad Tecnologica Nacional");

        //Crear al menos 3 profesores
        System.out.println("\n--- CREANDO PROFESORES ---");
        Profesor prof1 = new Profesor("P001", "Carlos Mendez", "Algoritmos");
        Profesor prof2 = new Profesor("P002", "Ana Lopez", "Python");
        Profesor prof3 = new Profesor("P003", "Roberto Diaz", "Java");

        //Crear 5 cursos
        System.out.println("\n--- CREANDO CURSOS ---");
        Curso curso1 = new Curso("ALG01", "Algoritmos I");
        Curso curso2 = new Curso("ALG02", "Algoritmos II");
        Curso curso3 = new Curso("PYT01", "Python");
        Curso curso4 = new Curso("JAVA01", "Java I");
        Curso curso5 = new Curso("JAVA02", "JAva II");

        //Agregar profesores y cursos a la universidad
        System.out.println("\n--- REGISTRANDO EN UNIVERSIDAD ---");
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        //Asignar profesores a cursos
        System.out.println("\n--- ASIGNANDO PROFESORES A CURSOS ---");
        universidad.asignarProfesorACurso("ALG01", "P001");  // Profesor Carlos a Curso Algoritmos I
        universidad.asignarProfesorACurso("ALG02", "P001");  // Profesor Carlos a Curso Algoritmos II
        universidad.asignarProfesorACurso("PYT01", "P002");  // Profesora Ana  a Curso Python
        universidad.asignarProfesorACurso("JAVA01", "P003"); // Profesor Poberto  a Curso Java I
        universidad.asignarProfesorACurso("JAVA02", "P003"); // Profesor Roberto  a Curso JAva II

        //Listar cursos con su profesor y profesores con sus cursos
        System.out.println("\n--- LISTADO COMPLETO ---");
        universidad.listarCursos();
        universidad.listarProfesores();

        //Cambiar el profesor de un curso y verificar sincronización
        System.out.println("\n--- CAMBIANDO PROFESOR DE CURSO ---");
        System.out.println("ANTES del cambio:");
        curso1.mostrarInfo();
        prof1.listarCursos();
        prof2.listarCursos();

        universidad.asignarProfesorACurso("ALG01", "P002"); // Cambiar Cálculo I de Carlos a Ana

        System.out.println("\nDESPUÉS del cambio:");
        curso1.mostrarInfo();
        prof1.listarCursos();
        prof2.listarCursos();

        //Remover un curso y confirmar que ya no aparece en la lista del profesor
        System.out.println("\n--- ELIMINANDO CURSO ---");
        System.out.println("ANTES de eliminar curso ALG02:");
        prof3.listarCursos();

        universidad.eliminarCurso("ALG02");

        prof3.listarCursos();

        //Remover un profesor y verificar que sus cursos quedan sin profesor
        System.out.println("\n--- ELIMINANDO PROFESOR ---");
        System.out.println("ANTES de eliminar profesor:");
        curso3.mostrarInfo();
        curso4.mostrarInfo();

        universidad.eliminarProfesor("P003"); // Eliminar al profesor Roberto

        System.out.println("\nDESPUÉS de eliminar profesor:");
        curso3.mostrarInfo();
        curso4.mostrarInfo();

        //Mostrar reporte final
        universidad.mostrarReporteCursosPorProfesor();

        //Demostración adicional: asignar curso sin profesor
        System.out.println("\n--- ASIGNANDO CURSO SIN PROFESOR ---");
        curso4.setProfesor(null);
        curso4.mostrarInfo();
    }
}
