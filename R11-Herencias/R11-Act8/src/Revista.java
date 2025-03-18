public class Revista extends Publicacion{
    
    protected int numero;

    public Revista (String ISBN, String titulo, int fecha_publicacion, int numero){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.fecha_publicacion=fecha_publicacion;
        this.numero=numero;
    }


    @Override
    public String toString() {
        return "ISBN: " + this.ISBN + ", título: " + this.titulo + ", año de publicación: " + this.fecha_publicacion;
    }
}
