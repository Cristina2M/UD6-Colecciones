public class Profesor extends Personas {
    private String asignatura;

    // Constructor
    public Profesor(String nombre, String asignatura) {
        super(nombre);  
        this.asignatura = asignatura;
    }

 
    public String getAsignatura() {
        return asignatura;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre del profesor: " + getNombre());
        System.out.println("Asignatura: " + asignatura);
    }
}

