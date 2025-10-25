package ejer3;
public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoTemporal(String nombre, String id, int horasTrabajadas, double tarifaHora) {
        // Llama al constructor de la superclase
        super(nombre, id); 
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSueldo() {
        return this.horasTrabajadas * this.tarifaHora;
    }

    // Método mostrartipodecontrato DE TEMPORALL
    public void mostrarHoras() {
         System.out.println("Tipo: Empleado Temporal (" + horasTrabajadas + " horas)");
    }
}