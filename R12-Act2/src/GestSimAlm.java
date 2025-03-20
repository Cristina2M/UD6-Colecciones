public class GestSimAlm {
    private AlmArticulo almArticulo = new AlmArticulo();

    public void entradaAutomatizada() {
        almArticulo.almacena(new Articulo("A001", "Laptop"));
        almArticulo.almacena(new Articulo("A002", "Mouse"));
        almArticulo.almacena(new Articulo("A003", "Teclado"));
        almArticulo.almacena(new Articulo("A004", "Monitor"));
    }

    public void lista() {
        for (Articulo articulo : almArticulo.getAlmacen()) {
            System.out.println(articulo);
        }
    }

    public void alta(String codigo, String descripcion) {
        almArticulo.almacena(new Articulo(codigo, descripcion));
    }

    public void baja(String codigo) {
        almArticulo.getAlmacen().removeIf(articulo -> articulo.getCodigo().equals(codigo));
    }

    public void entradaMercancia(String codigo, int cantidad) {
        for (Articulo articulo : almArticulo.getAlmacen()) {
            if (articulo.getCodigo().equals(codigo)) {
                articulo.setStock(articulo.getStock() + cantidad);
                break;
            }
        }
    }

    public void salidaMercancia(String codigo, int cantidad) {
        for (Articulo articulo : almArticulo.getAlmacen()) {
            if (articulo.getCodigo().equals(codigo) && articulo.getStock() >= cantidad) {
                articulo.setStock(articulo.getStock() - cantidad);
                break;
            }
        }
    }
}
