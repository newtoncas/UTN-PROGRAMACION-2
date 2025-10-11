package ejer1;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;
            
    //Inicializacion del Array
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    //Agregar un producto
    public void agregarProducto(Producto p) {
        this.productos.add(p);
        System.out.println("Producto: " + p.getNombre()+" agregado.");
    }

    //Listar los productos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario esta vacio");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    //Buscar un producto por su Id, se usara el producto con id 03
    public Producto buscarProductoPorId(String id) {
        
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                p.mostrarInfo();
                return p;
            }
        }
        return null;
    }
    
    //Eliminar un producto  por su id, se usara el producto con id 03
    public boolean eliminarProducto(String id){
        Producto p = buscarProductoPorId(id);      
        
        if(p!=null) {
            productos.remove(p);
            System.out.println("*El producto "+ p.getNombre()+" con el id "+id+" ha sido eliminado del inventario\n");
            return true;
        }else{
            System.out.println("No se encontró el producto con id: "+id+" a eliminar");
            return false;
        }                 
    }
    
    //Actualizar el Stock
   public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad); // Llama al setter con validación
            System.out.println("*El stock del producto: " + p.getNombre() + "'  ha sido actualizado a " + p.getCantidad()+ " unidades\n");
            return true;
        }
        System.out.println("El producto con ID " + id + " no se encuentra en el inventario.");
        return false;
    }
    
    //Filtrar por categoria
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("Productos en categoría: " + categoria);
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
            }
        }
    }
      
    //Obtener el Stock total
    public void obtenerTotalStock() {
        int total = 0;
        
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        System.out.println("\n*Total: " + total + " articulos en el inventario.");
    }
    
    //Obtener el producto con mayor Stock
    public void obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            System.out.println("*No hay productos en el inventario\n");
        }
        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                p.mostrarInfo();     
                System.out.println("*El producto "+ p.getNombre()+" es el que tiene mayor stock: "+ p.getCantidad());
            }
        }
    }
    
    //Filtrar productos por precio
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("Productos con precio entre $" + min + " y $" + max + ":");
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
            }
        }
    }
    
    //Mostrar categorias disponibles
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " - " + c.getDescripcion());
        }
    }   
}



