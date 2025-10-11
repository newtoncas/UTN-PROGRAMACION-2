package ejer1;

public class ejer1main {

    public static void main(String[] args) {
        System.out.println("----SISTEMA DE STOCK----\n");

        //Creacion del inventario
        Inventario inventario = new Inventario();

        //Creacion de los productos
        Producto p1 = new Producto("01", "Leche", 1000.0, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("02", "Smart TV", 650000.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("03", "Campera", .750000, 50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("04", "Aspiradora", 125000.0, 30, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("05", "Auriculares", 15000.0, 150, CategoriaProducto.ELECTRONICA);

        //Agregar los produtos creados al Inventario
        System.out.println("---AGREGANDO PRODUCTOS AL INVENTARIO---");
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        //Listar todos los productos
        System.out.println("---LISTA DE PRODUCTOS EN EL INVENTARIO---");
        inventario.listarProductos();

        //Buscar un producto por su id (p3 con id 03)
        System.out.println("\n---BÚSQUEDA POR ID: 03---");
        inventario.buscarProductoPorId("03");

        //Filtrar un producto por su categoria (ELECTRONICA)
        System.out.println("\n---FILTRAR PRODUCTOS DE CATEGORIA ALIMENTOS---");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        //Eliminar el producto con id 03
        System.out.println("\n---ELIMINACIÓN DE PRODUCTOS POR ID: 03---");
        inventario.eliminarProducto("03");
        inventario.listarProductos();

        //Actualizar el stock del producto id 04 Aspiradora de 30 a 50
        System.out.println("\n---ACTUALIZAR STOCK POR ID: 04---");
        inventario.actualizarStock("04", 50);
        inventario.listarProductos();

        //Mostrar el total de stock disponible
        System.out.println("\n---TOTAL STOCK DISPONIBLE---");
        inventario.obtenerTotalStock();

        //Obetener y mostrar el producto con mayor stock
        System.out.println("\n---PRODUCTO CON MAYOR STOCK---");
        inventario.obtenerProductoConMayorStock();

        //Filtrar productos con precios entre 1.000 y 15.000
        System.out.println("\n---FILTRAR PRODUCTOS POR PRECIO (1.000 - 15.000)---");
        inventario.filtrarProductosPorPrecio(1000.0, 15000.0);

        //Mostrar las categorias disponibles con sus descripciones
        System.out.println("\n---CATEGORÍAS DISPONIBLES---");
        inventario.mostrarCategoriasDisponibles();

    }

}

