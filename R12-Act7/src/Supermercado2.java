import java.util.HashMap;
import java.util.Scanner;

public class Supermercado2 {
    public static void main(String[] args) {
         // Diccionario de productos y precios
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);
    
        // Diccionario para almacenar la compra (producto -> cantidad)
        HashMap<String, Integer> compra = new HashMap<>();
    
        Scanner entrada = new Scanner(System.in);
        String producto;
    
        // Bucle para realizar la compra
        while (true) {
            System.out.print("PRODUCTO: ");
            producto = entrada.nextLine().toLowerCase();
    
            if (producto.equals("fin")) {
                break;
            }
    
            System.out.print("CANTIDAD: ");
            int cantidad = entrada.nextInt();
            entrada.nextLine();
    
            // Agrupar productos repetidos
            compra.merge(producto, cantidad, Integer::sum);
        }
    
        // Solicitar código de descuento
        System.out.print("Introduce el código de descuento (ECODTO, DESC2, o SIN_DESCUENTO): ");
        String codigoDescuentoStr = entrada.nextLine().toUpperCase();
        Descuentos codigoDescuento = Descuentos.SIN_DESCUENTO; // Descuento por defecto
    
        try {
            codigoDescuento = Descuentos.valueOf(codigoDescuentoStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Código de descuento no válido. Se aplicará SIN_DESCUENTO.");
        }
    
        // Mostrar resumen de la compra
        System.out.println("PRODUCTO PRECIO CANTIDAD SUBTOTAL");
        System.out.println("--------------------------------");
    
        double totalCompra = 0;
        for (String nombreProducto : compra.keySet()) {
            int cantidad = compra.get(nombreProducto);
            double precioUnitario = productos.get(nombreProducto);
            double precioTotalProducto = precioUnitario * cantidad;
            totalCompra += precioTotalProducto;
    
            System.out.printf("%-8s %-6.2f %-8d %-6.2f\n", nombreProducto, precioUnitario, cantidad, precioTotalProducto);
        }
    
        System.out.println("--------------------------------");
    
        // Aplicar descuento
        double descuentoAplicado = totalCompra * codigoDescuento.getDescuento();
        double totalConDescuento = totalCompra - descuentoAplicado;
    
        System.out.printf("DESCUENTO: %.2f\n", descuentoAplicado);
        System.out.println("--------------------------------");
        System.out.printf("TOTAL: %.2f\n", totalConDescuento);
    
        entrada.close();
    }
}


