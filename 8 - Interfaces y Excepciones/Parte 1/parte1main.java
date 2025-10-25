package tp8.Parte1;
import java.util.ArrayList;
import java.util.List;
public class parte1main {

    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE E-COMMERCE ---");
        System.out.println();
        
        //  Crear cliente
        Cliente cliente = new Cliente("María González", "maria.gonzalez@email.com");
        System.out.println(" Cliente creado: " + cliente.getNombre() + " (" + cliente.getEmail() + ")");
        
        //  Crear productos
        List<Producto> productos = crearProductos();
        mostrarProductosDisponibles(productos);
        
        //  Crear pedido y agregar productos
        Pedido pedido = crearPedido(cliente, productos);
        mostrarResumenPedido(pedido);
        
        //  Procesar pagos
        procesarPagos(pedido);
        
        //  Seguimiento del pedido
        realizarSeguimientoPedido(pedido);
       
        
        System.out.println("\n --- SISTEMA FINALIZADO ---");
    }
    
    // Métodos auxiliares para organizar el código
    private static List<Producto> crearProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Notebook ", 1200000.00));
        productos.add(new Producto("Mouse Inalámbrico ", 45000.99));
        productos.add(new Producto("Teclado ", 89000.50));
        productos.add(new Producto("Monitor ", 299000.99));
        return productos;
    }
    
    private static void mostrarProductosDisponibles(List<Producto> productos) {
        System.out.println("\n PRODUCTOS DISPONIBLES:");
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            System.out.println((i + 1) + ". " + p.getNombre() + " - $" + 
                             String.format("%.2f", p.getPrecio()));
        }
    }
    
    private static Pedido crearPedido(Cliente cliente, List<Producto> productos) {
        Pedido pedido = new Pedido(cliente);
        // Agregar algunos productos al pedido
        pedido.agregarProducto(productos.get(0)); // Laptop
        pedido.agregarProducto(productos.get(1)); // Mouse
        pedido.agregarProducto(productos.get(3)); // Monitor
        return pedido;
    }
    
    private static void mostrarResumenPedido(Pedido pedido) {
        System.out.println("\n --- RESUMEN DEL PEDIDO ---");
        System.out.println("Cliente: " + pedido.getProductos().get(0).getNombre()); // Acceso indirecto al cliente
        System.out.println("Productos en el pedido:");
        for (Producto producto : pedido.getProductos()) {
            System.out.println("  * " + producto.getNombre() + " - $" + 
                             String.format("%.2f", producto.getPrecio()));
        }
        double totalPedido = pedido.calcularTotal();
        System.out.println(" Total del pedido: $" + String.format("%.2f", totalPedido));
        System.out.println(" Cantidad de productos: " + pedido.getProductos().size());
    }
    
    private static void procesarPagos(Pedido pedido) {
        System.out.println("\n --- PROCESO DE PAGO ---");
        double totalPedido = pedido.calcularTotal();
        
        // Opción 1: Pago con Tarjeta de Crédito (con descuento)
        System.out.println("\n--- Opción 1: Tarjeta de Crédito ---");
        TarjetaCredito tarjeta = new TarjetaCredito("4111-1111-1111-1111", "María González");
        tarjeta.aplicarDescuento(15); // 15% de descuento
        double totalConDescuento = tarjeta.calcularTotalConDescuento(totalPedido, 15);
        tarjeta.procesarPago(totalConDescuento);
        
        // Opción 2: Pago con PayPal
        System.out.println("\n--- Opción 2: PayPal ---");
        PayPal paypal = new PayPal("maria.gonzalez@email.com", "MariaGonzalez");
        paypal.procesarPago(totalPedido);
        
    }
    
    private static void realizarSeguimientoPedido(Pedido pedido) {
        System.out.println("\n--- SEGUIMIENTO DEL PEDIDO ---");
        String[] estados = {"CONFIRMADO", "PREPARANDO ENVÍO", "EN CAMINO", "ENTREGADO"};
        
        for (String estado : estados) {
            try {
                Thread.sleep(1000); // Simular tiempo entre estados
                pedido.cambiarEstado(estado);
            } catch (InterruptedException e) {
                System.out.println("Interrupción en el seguimiento");
            }
        }
    }
    
    private static void demostrarPolimorfismo() {
        System.out.println("\n --- DEMOSTRACIÓN DE POLIMORFISMO ---");
        
        // Array de objetos Pagable (diferentes implementaciones)
        Pagable[] elementosPagables = {
            new Producto("Tablet", 299.99),
            new Producto("Auriculares Bluetooth", 79.99),
            new Producto("Cargador Portátil", 39.50)
        };
        
        System.out.println("Calculando totales de diferentes elementos pagables:");
        double totalGeneral = 0;
        for (int i = 0; i < elementosPagables.length; i++) {
            double totalElemento = elementosPagables[i].calcularTotal();
            Producto p = (Producto) elementosPagables[i]; // Cast seguro
            System.out.println((i + 1) + ". " + p.getNombre() + " - $" + 
                             String.format("%.2f", totalElemento));
            totalGeneral += totalElemento;
        }
        System.out.println(" Total general: $" + String.format("%.2f", totalGeneral));
    }

}