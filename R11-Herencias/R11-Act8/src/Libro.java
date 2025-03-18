public class Libro extends Publicacion implements Prestable{

    protected boolean prestado=false;


    public Libro (String ISBN, String titulo, int fecha_publicacion){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.fecha_publicacion=fecha_publicacion;
    }

    public boolean presta (){
        if (this.prestado){
            System.out.println("Lo siento, ese libro ya está prestado");
        } else {
        this.prestado=true;
        }
        return this.prestado;
    };
    public boolean devuelve (){
        if (this.prestado){
            this.prestado=false;
        } else {
            System.out.println("Ese libro no se puede devolver porque no ha sido prestado");
        }
        return this.prestado;
    }
    public boolean estaPrestado(){
        if (this.prestado) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String prest;
        if (this.prestado) {
            prest = "(prestado)";
        } else {
            prest = "(no prestado)";
        }
        return "ISBN: " + this.ISBN + ", título: " + this.titulo + ", año de publicación: " + this.fecha_publicacion + " " + prest;
    }


}
