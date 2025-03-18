public abstract class Personas {
    private String nombre;

    // Constructor
    public Personas(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Método abstracto que las subclases deben implementar
    public abstract void mostrar();
}

