import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Supermercado {
        public static void main(String[] args) {
            // Diccionario de productos y precios
            HashMap<String, Double> productos = new HashMap<>();
            productos.put("avena", 2.21);
            productos.put("garbanzos", 2.39);
            productos.put("tomate", 1.59);
            productos.put("jengibre", 3.13);
            productos.put("quinoa", 4.50);
            productos.put("guisantes", 1.60);
    

            // Listas para almacenar la compra
            ArrayList<String> productosComprados = new ArrayList<>();
            ArrayList<Integer> cantidadesCompradas = new ArrayList<>();
    
            Scanner entrada = new Scanner(System.in);
            String producto;
    


            // Bucle para realizar la compra
            while (true) {
                System.out.print("PRODUCTO: ");
                producto = entrada.nextLine().toLowerCase(); // Convertir a minúsculas para evitar errores
    
                if (producto.equals("fin")) {
                    System.out.println("");
                    break;
                }
    
                System.out.print("CANTIDAD: ");
                int cantidad = entrada.nextInt();
                entrada.nextLine(); // Consumir la nueva línea después de nextInt() (asi aparece lo siguiente abajo y no en la misma línea)
    
                productosComprados.add(producto);
                cantidadesCompradas.add(cantidad);
            }
    



            // Mostrar el resumen de la compra formateado
            System.out.println("PRODUCTO PRECIO CANTIDAD SUBTOTAL");
            System.out.println("--------------------------------");
    
            double totalCompra = 0;
            for (int i = 0; i < productosComprados.size(); i++) {
                String nombreProducto = productosComprados.get(i);
                int cantidad = cantidadesCompradas.get(i);
                double precioUnidad = productos.get(nombreProducto);
                double precioTotalProducto = precioUnidad * cantidad;
                totalCompra += precioTotalProducto;
    
                System.out.printf("%-8s %-6.2f %-8d %-6.2f\n", nombreProducto, precioUnidad, cantidad, precioTotalProducto);
            }
    
            System.out.println("--------------------------------");
            System.out.printf("TOTAL: %.2f\n", totalCompra);
    
            entrada.close();
        }
    }

