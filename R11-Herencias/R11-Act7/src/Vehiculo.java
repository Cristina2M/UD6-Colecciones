import java.util.Scanner;

// Clase abstracta Vehiculo
abstract class Vehiculo {
    // Atributos estáticos de clase
    static int vehiculosCreados = 0;
    static int kilometrosTotales = 0;

    // Atributo de instancia
    int kilometrosRecorridos;

    // Constructor
    public Vehiculo() {
        kilometrosRecorridos = 0;
        vehiculosCreados++;
    }

    // Método abstracto que las subclases deben implementar
    public abstract void recorrer(int kilometros);

    // Método estático para mostrar estadísticas
    public static void mostrarEstadisticas() {
        System.out.println("Vehículos creados: " + vehiculosCreados);
        System.out.println("Kilómetros totales recorridos por todos los vehículos: " + kilometrosTotales);
    }
}

// Subclase Bicicleta
class Bicicleta extends Vehiculo {
    
    public Bicicleta() {
        super();
    }

    // Implementación del método recorrer
    @Override
    public void recorrer(int kilometros) {
        kilometrosRecorridos += kilometros;
        kilometrosTotales += kilometros;
        System.out.println("Bicicleta ha recorrido " + kilometros + " kilómetros.");
    }

    // Método específico de la bicicleta
    public void hacerTruco() {
        System.out.println("¡La bicicleta ha hecho un truco!");
    }
}

// Subclase Coche
class Coche extends Vehiculo {
    
    public Coche() {
        super();
    }

    // Implementación del método recorrer
    @Override
    public void recorrer(int kilometros) {
        kilometrosRecorridos += kilometros;
        kilometrosTotales += kilometros;
        System.out.println("Coche ha recorrido " + kilometros + " kilómetros.");
    }

    // Método específico del coche
    public void encenderAireAcondicionado() {
        System.out.println("El aire acondicionado del coche está encendido.");
    }
}

// Clase principal para probar las clases
public class Vehiculo {
    private static Bicicleta bicicleta;
    private static Coche coche;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            // Menú de opciones
            System.out.println("\nMenu:");
            System.out.println("1. Crear bicicleta");
            System.out.println("2. Crear coche");
            System.out.println("3. Recorrer kilómetros (Bicicleta)");
            System.out.println("4. Recorrer kilómetros (Coche)");
            System.out.println("5. Hacer truco (Bicicleta)");
            System.out.println("6. Encender aire acondicionado (Coche)");
            System.out.println("7. Mostrar estadísticas");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    bicicleta = new Bicicleta();
                    System.out.println("Bicicleta creada.");
                    break;
                case 2:
                    coche = new Coche();
                    System.out.println("Coche creado.");
                    break;
                case 3:
                    if (bicicleta != null) {
                        System.out.print("¿Cuántos kilómetros recorrerá la bicicleta? ");
                        int kilometros = scanner.nextInt();
                        bicicleta.recorrer(kilometros);
                    } else {
                        System.out.println("Primero cree una bicicleta.");
                    }
                    break;
                case 4:
                    if (coche != null) {
                        System.out.print("¿Cuántos kilómetros recorrerá el coche? ");
                        int kilometros = scanner.nextInt();
                        coche.recorrer(kilometros);
                    } else {
                        System.out.println("Primero cree un coche.");
                    }
                    break;
                case 5:
                    if (bicicleta != null) {
                        bicicleta.hacerTruco();
                    } else {
                        System.out.println("Primero cree una bicicleta.");
                    }
                    break;
                case 6:
                    if (coche != null) {
                        coche.encenderAireAcondicionado();
                    } else {
                        System.out.println("Primero cree un coche.");
                    }
                    break;
                case 7:
                    Vehiculo.mostrarEstadisticas();
                    break;
                case 8:
                    salir = true;
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}

