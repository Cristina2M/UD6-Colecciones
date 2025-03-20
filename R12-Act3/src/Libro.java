public class Libro extends Publicacion {
    private String autor;

    public Libro(String titulo, int anioPublicacion, String autor) {
        super(titulo, anioPublicacion);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor;
    }
}