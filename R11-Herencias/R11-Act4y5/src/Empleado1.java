public abstract class Empleado1 {
    private String nombre;

    // Constructor por defecto
    public Empleado1() {
        this.nombre = "";
    }

    // Constructor con parámetros
    public Empleado1(String nombre) {
        this.nombre = nombre;
    }

    // Método set para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método get para el nombre
    public String getNombre() {
        return this.nombre;
    }

    // Método abstracto toString para que las subclases lo implementen
    public abstract String toString();
}

