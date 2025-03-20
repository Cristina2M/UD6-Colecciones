import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<String> opciones;

    public Menu() {
        opciones = new ArrayList<>();
    }

    public void creaOpcion(String opcion) {
        opciones.add(opcion);
    }

    public void muestraMenu() {
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ". " + opciones.get(i));
        }
    }

    public int capturaOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcionSeleccionada = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Seleccione una opción: ");
                opcionSeleccionada = entrada.nextInt();

                if (opcionSeleccionada >= 1 && opcionSeleccionada <= opciones.size()) {
                    entradaValida = true;
                } else {
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                entrada.next();
            }
        }

        return opcionSeleccionada;
    }
}
