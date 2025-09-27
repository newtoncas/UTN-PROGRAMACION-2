package ejer4;

public class Tarjeta {

    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public Tarjeta(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco; 
        this.cliente = cliente;
        cliente.setTarjeta(this); 
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
