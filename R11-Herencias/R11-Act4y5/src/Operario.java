public class Operario extends Empleado {
 
    public Operario() {
    }
    public Operario(String nombre){
        super(nombre);
    }
    // Sobrescribimos el método toString
    @Override
    public  abstract String toString() {
    }
}

