public class LineaPedido {
    String nombreArticulo;
    int cantidad;

    public LineaPedido(String nombre, int cant){
        this.nombreArticulo = nombre;
        this.cantidad = cant;
    }

    public int getCantidad(){
        return cantidad;
    }

    public String getNombreArt(){
        return nombreArticulo;
    }

    public void setCantidad(int cant){
        this.cantidad=cant;
    }

    public void setNombreArt(String producto){
        this.nombreArticulo=producto;
    }

    
}
