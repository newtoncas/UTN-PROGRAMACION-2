package ejer3;
import java.util.ArrayList;
import java.util.List;
public class ejer3main {

    public static void main(String[] args) {
        // Se crea una lista para almacenar diferentes tipos de Empleados
        List<Empleado> listaEmpleados = new ArrayList<>();

        // Instanciar los empleados
        listaEmpleados.add(new EmpleadoPlanta("Lando Norris", "21.000.000", 50000.0));
        listaEmpleados.add(new EmpleadoTemporal("Fernando Alonso", "22.000.000", 120, 350.0));
        listaEmpleados.add(new EmpleadoPlanta("Oscar Piastri", "23.000.000", 60000.0));
        listaEmpleados.add(new EmpleadoTemporal("Franco Colapinto", "24.000.000", 80, 400.0));

        // Se invoca el metodo calcularsueldo de forma polimórfica y con instanceof
        System.out.println("\n--- Calculando Sueldos ---");
        for (Empleado emp : listaEmpleados) {
            emp.mostrarInfoBasica(); 
            
            double sueldo = emp.calcularSueldo();
            System.out.printf("  Sueldo Calculado: $%.2f\n", sueldo);

            if (emp instanceof EmpleadoPlanta) {
                ((EmpleadoPlanta) emp).mostrarTipoContrato();
            } else if (emp instanceof EmpleadoTemporal) {
                 ((EmpleadoTemporal) emp).mostrarHoras();
            }
            System.out.println("\n");
        }
    }
}