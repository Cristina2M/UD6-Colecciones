public class Desarrollador extends Empleado {
    
    // Constructor con parámetros
    public Desarrollador(String nombre) {
        super(nombre);  // Llamada al constructor de la clase base
    }

    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Desarrollador " + getNombre();
    }
}
