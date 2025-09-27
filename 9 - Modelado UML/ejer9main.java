package ejer9;
public class ejer9main {

    public static void main(String[] args) {
        
        // Creacion de objetos
        Paciente paciente = new Paciente("Cristian Serna", "OSDE");
        Profesional profesional = new Profesional("Dr. Pepe Argento", "Cardiología");
        CitaMedica cita = new CitaMedica("26-09-2025", "11:00", paciente, profesional);

        // --- Verificación de las relaciones ---

        System.out.println("--- Informacion de la Cita Médica ---");
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Hora: " + cita.getHora());

        System.out.println("\n--- Datos del PAciente ---");
        System.out.println("La cita es para el paciente: " + cita.getPaciente().getNombre());
        System.out.println("Obra Social: " + cita.getPaciente().getObraSocial());

        System.out.println("\n--- Datos del Profesional ---");
        System.out.println("La cita es con el profesional: " + cita.getProfesional().getNombre());
        System.out.println("Especialidad del profesional: " + cita.getProfesional().getEspecialidad());
    }
}