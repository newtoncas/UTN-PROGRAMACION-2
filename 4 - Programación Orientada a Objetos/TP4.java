package tp.pkg4;

public class TP4 {

    public static void main(String[] args) {
        // Se crean 3 empleados con ambos constructores (completa y 2 parametros)
        Empleado e1 = new Empleado(1, "Pepe Argento", "Data Analyst", 2000000);
        Empleado e2 = new Empleado("Ricardo Fort", "Developer");

        // Aumentos de salario por porcentaje y cantidad fija
        e1.actualizarSalario(10.0);   // aumento del 10%
        e2.actualizarSalario(5000); // aumento fijo de 5000

        // Se muestra información de cada empleado
        System.out.println(e1);
        System.out.println(e2);

        // Se muestra el total de empleados creados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
