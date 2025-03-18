public abstract class Empleado {
    private String nombre;

    // Constructor por defecto
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método set y get
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    // Método toString
    @Override
    public String toString() {
        return "Empleado " + this.nombre;
    }
}

// Clase derivada Directivo
class Directivo extends Empleado {
    // Constructor que recibe un nombre
    public Directivo(String nombre) {
        super(nombre); // Llama al constructor de la clase base
    }

    // Sobrescribimos el método toString
    @Override
    public abstract String toString() {
        return super.toString() + " -> Directivo";
    }
}
