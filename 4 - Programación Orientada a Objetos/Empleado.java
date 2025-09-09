package tp.pkg4;

public class Empleado {
    // Atributos privados
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático para contar empleados
    private static int totalEmpleados = 0;
    private static int generadorId = 1; // para IDs automáticos

    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;       // Incremento de totalEmpleados
    }

    // Constructor con nombre y puesto (id automático y salario por defecto)
    public Empleado(String nombre, String puesto) {
        this.id = generadorId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 3000000; // salario por defecto
        totalEmpleados++;    // Incremento de totalEmpleados
    }

    // Método sobrecargado actualizarSalario que recibe porcentaje
    public void actualizarSalario(double porcentaje) {
        salario += this.salario * (porcentaje / 100);
    }
    
    // Método sobrecargado actualizarSalario que recibe cantidad fija
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    // Método toString para Mostrar id, nombre, puesto y salario de forma legible
    @Override
    public String toString() {
        return "Empleado {" + "Id = " + id + ", Nombre = " + nombre +
                ", Puesto = " + puesto + ", Salario = " + salario + " }";
    }

    // Método estático mostrarTotalEmpleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    //Encapsulamiento de los atributos
    // Getters y Setters de nombre, puesto y Salario
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
