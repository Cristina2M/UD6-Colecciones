public class Restaurante {
    public static void main(String[] args) {
        
        //Crear un pedido de tipo PIZZA
        Pedido pedido1 = new Pedido(TipoComida.PIZZA);
        pedido1.agregarIngrediente("Pepperoni");
        pedido1.agregarIngrediente("Champiñones");
        pedido1.mostrarPedido();

        //Crear un pedido de tipo HAMBURGUESA
        Pedido pedido2 = new Pedido(TipoComida.HAMBURGUESA);
        pedido2.agregarIngrediente("Queso");
        pedido2.mostrarPedido();

        //Crear un pedido de tipo ENSALADA
        Pedido pedido3 = new Pedido(TipoComida.ENSALADA);
        pedido3.mostrarPedido();

        // Crear un pedido de tipo PASTA
        Pedido pedido4 = new Pedido(TipoComida.PASTA);
        pedido4.agregarIngrediente("Albahaca");
        pedido4.mostrarPedido();

        // Mostrar el número total de pedidos realizados
        System.out.println("Número total de pedidos realizados: " + Pedido.getNumeroPedidos());



    }
}



/* 
---------COMO DEBE DE SALIR EL PROGRAMA POR PANTALLA-----------

Pedido: PIZZA
ID del pedido: 1
Ingredientes extras: [Champiñones, Pepperoni]
Pedido: HAMBURGUESA
ID del pedido: 2
Ingredientes extras: [Queso]
Pedido: ENSALADA
ID del pedido: 3
Ingredientes extras: Ninguno
Pedido: PASTA
ID del pedido: 4
Ingredientes extras: [Albahaca]
Número total de pedidos realizados: 4
 */