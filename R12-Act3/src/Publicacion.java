public abstract class Publicacion implements Comparable<Publicacion> {
    private String titulo;
    private int anioPublicacion;

    public Publicacion(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    @Override
    public int compareTo(Publicacion otraPublicacion) {
        return this.titulo.compareTo(otraPublicacion.getTitulo());
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Año de publicación: " + anioPublicacion;
    }
}