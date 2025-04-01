import java.util.HashSet;

public class Pedido {
    private static int numeroPedidos = 0;
    private int numeroPedido;
    private TipoComida tipoComida;
    private HashSet<String> ingredientesAdicionales;

    public Pedido(TipoComida tipoComida) {
        numeroPedidos++;
        this.numeroPedido = numeroPedidos;
        this.tipoComida = tipoComida;
        this.ingredientesAdicionales = new HashSet<>();
    }

    public void agregarIngrediente(String ingrediente) {
        this.ingredientesAdicionales.add(ingrediente);
    }

    public void mostrarPedido() {
        System.out.println("Pedido: " + tipoComida);
        System.out.println("ID del pedido: " + numeroPedido);
        if (ingredientesAdicionales.isEmpty()) {
            System.out.println("Ingredientes extras: Ninguno");
        } else {
            System.out.println("Ingredientes extras: " + ingredientesAdicionales);
        }
    }

    public static int getNumeroPedidos() {
        return numeroPedidos;
    }
}