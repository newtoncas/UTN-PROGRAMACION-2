package ejer3;
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;

    public EmpleadoPlanta(String nombre, String id, double sueldoBase) {
        // Llama al constructor de la superclase
        super(nombre, id); 
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSueldo() {
        return this.sueldoBase;
    }
    
    // Metodo mostrartipodecontrato DE PLANTA
    public void mostrarTipoContrato() {
        System.out.println("Tipo: Empleado de Planta");
    }
}