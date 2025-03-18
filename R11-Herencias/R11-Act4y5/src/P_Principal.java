public class P_Principal {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Carlos") {

            @Override
            public String toString() {
                return "Empleado " + getNombre();
            }
        };
        
        Gerente gerente = new Gerente("Ana");
        Desarrollador desarrollador = new Desarrollador("Luis");
        Vendedor vendedor = new Vendedor("María");

   
        System.out.println(empleado.toString());
        System.out.println(gerente.toString());
        System.out.println(desarrollador.toString());
        System.out.println(vendedor.toString());
    }
}
