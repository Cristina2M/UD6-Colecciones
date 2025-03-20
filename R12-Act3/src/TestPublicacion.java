import java.util.ArrayList;
import java.util.Collections;

public class TestPublicacion {
    public static void main(String[] args) {
        ArrayList<Publicacion> publicaciones = new ArrayList<>();

        publicaciones.add(new Libro("El Señor de los Anillos", 1954, "J.R.R. Tolkien"));
        publicaciones.add(new Revista("National Geographic", 2023, 10));
        publicaciones.add(new Libro("Cien años de soledad", 1967, "Gabriel García Márquez"));

        System.out.println("Publicaciones sin ordenar:");
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion);
        }

        Collections.sort(publicaciones);

        System.out.println("\nPublicaciones ordenadas por título:");
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion);
        }
    }
}
