public class P_Principal {
    public static void main(String[] args) {
   
        Alumno alumno = new Alumno("Carlos Pérez", "12345");

        Profesor profesor = new Profesor("Ana Gómez", "Matemáticas");

        System.out.println("Información del Alumno:");
        alumno.mostrar();
        System.out.println(); 

        System.out.println("Información del Profesor:");
        profesor.mostrar();
    }
}

