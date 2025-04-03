import java.util.HashSet;

public class Pedido {
    // ATRIBUTOS
    private static int numeroPedidos = 0;
    private int numeroPedido;
    private TipoComida tipoComida;
    private HashSet<String> ingredientesAdicionales;


    // CONSTRUCTOR
    public Pedido(TipoComida tipoComida) {
        numeroPedidos++;
        this.numeroPedido = numeroPedidos;
        this.tipoComida = tipoComida;
        this.ingredientesAdicionales = new HashSet<>();
    }


    
    //MÉTODOS
    public void agregarIngrediente(String ingrediente) {
        this.ingredientesAdicionales.add(ingrediente);// se van añadiendo los ingredientes
    }


    public void mostrarPedido() {
        System.out.println("Pedido: " + tipoComida);
        System.out.println("ID del pedido: " + numeroPedido);
        if (ingredientesAdicionales.isEmpty()) { // comprobamos si está vacío
            System.out.println("Ingredientes extras: Ninguno");
        } else { // si contiene valores, los muestra
            System.out.println("Ingredientes extras: " + ingredientesAdicionales);
        }
        System.out.println(); // Para añadir un salto de línea y que los pedidos salgan con un espacio de separación
    }
/*
    OTRA FORMA DE COMPROBAR QUE NO HAYA AÑADIDO NINGÚN INGREDIENTE EN UNA SOLA LÍNEA

    public void mostrarPedido() {
        System.out.println("Pedido: " + tipoComida);
        System.out.println("ID del pedido: " + numeroPedido);
        System.out.println("Ingredientes extras: " + (ingredientesAdicionales.isEmpty() ? "Ninguno" : ingredientesAdicionales));
    }
LO QUE HACE ES QUE PREGUNTA SI INGREDIENTESADICIONALES ESTÁ VACÍO, SI ES TRUE, ESCRIBE LA PRIMERA OPCIÓN Y SI ES FASE ESCRIBE LA SEGUNDA OPCIÓN (LA QUE HAY DESPUÉS DE LOS :)
UNICAMENTE DEVUELVE TRUE O FALSE, NO PUEDE DEVOLVER OTROS VALORES
*/

    public static int getNumeroPedidos() {
        return numeroPedidos;
    }
}