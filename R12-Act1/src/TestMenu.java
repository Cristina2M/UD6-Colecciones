public class TestMenu {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.creaOpcion("Opción 1");
        menu.creaOpcion("Opción 2");
        menu.creaOpcion("Opción 3");

        menu.muestraMenu();
        int opcionSeleccionada = menu.capturaOpcion();

        System.out.println("Opción seleccionada: " + opcionSeleccionada);
    }
}
