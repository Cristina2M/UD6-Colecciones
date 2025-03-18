public class Vendedor extends Empleado {
    
    // Constructor con parámetros
    public Vendedor(String nombre) {
        super(nombre);  // Llamada al constructor de la clase base
    }

    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Vendedor " + getNombre();
    }
}
