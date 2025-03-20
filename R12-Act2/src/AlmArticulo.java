import java.util.ArrayList;
public class AlmArticulo {
    private ArrayList<Articulo> almacen = new ArrayList<>();

    public void almacena(Articulo articulo) {
        almacen.add(articulo);
    }

    public ArrayList<Articulo> getAlmacen() {
        return almacen;
    }
}