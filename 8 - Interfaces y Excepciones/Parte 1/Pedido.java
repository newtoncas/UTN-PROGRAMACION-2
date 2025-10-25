package tp8.Parte1;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable, Notificable {
    private List<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCambioEstado(); // Notificar al cliente del cambio
    }

    @Override
    public void notificarCambioEstado() {
        cliente.recibirNotificacion("El estado de su pedido ha cambiado a: " + estado);
    }

    // Getters
    public String getEstado() { return estado; }
    public List<Producto> getProductos() { return productos; }
}