import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Super_v2 {

    public static void main(String[] args) {


        HashMap<String, Double> productos = new HashMap<>();
        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);
    
        Scanner entrada = new Scanner(System.in);


        

        ArrayList <LineaPedido> listaArticulos = new ArrayList<>();




        String nombre;
        int cantidad;
        while (true) {
            System.out.print("PRODUCTO: ");
            nombre = entrada.nextLine().toLowerCase();
    
            if (nombre.equals("fin")) {
                System.out.println("");
                break;
            }
    
            System.out.print("CANTIDAD: ");
            cantidad = entrada.nextInt();
            entrada.nextLine();
    
            LineaPedido pedido = new LineaPedido(nombre, cantidad);
            listaArticulos.add(pedido);
        }
    



        System.out.println("PRODUCTO PRECIO CANTIDAD SUBTOTAL");
        System.out.println("--------------------------------");
    
        
        LineaPedido pedidoN = new LineaPedido(null, 0);
        double totalCompra = 0;
        for (int i = 0; i < listaArticulos.size(); i++) {
            pedidoN = listaArticulos.get(i);
            String nombreP = pedidoN.getNombreArt(); ;
            int cant = pedidoN.getCantidad();
            double precioUnidad = productos.get(nombreP);
            double precioTotalProducto = precioUnidad * cant;
            totalCompra += precioTotalProducto;
    
            System.out.printf("%-8s %-6.2f %-8d %-6.2f\n", nombreP, precioUnidad, cant, precioTotalProducto);
        }
    
        System.out.println("--------------------------------");
        System.out.printf("TOTAL: %.2f\n", totalCompra);
    
        entrada.close();
    }
}



