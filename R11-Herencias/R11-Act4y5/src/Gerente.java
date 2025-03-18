public class Gerente extends Empleado {
    
    // Constructor con parámetros
    public Gerente(String nombre) {
        super(nombre);  // Llamada al constructor de la clase base
    }

    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Gerente " + getNombre();
    }
}
