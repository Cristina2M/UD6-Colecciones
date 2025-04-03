import java.util.HashSet;
 import java.util.Scanner;
 
 public class Suma {
 
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

         HashSet<Integer> numeros = new HashSet<>();
         int suma = 0;
 
         // Pedimos que escriban 5 números diferentes
         System.out.println("Ingresa 5 números diferentes:");
         while (numeros.size() < 5) { // bucle que se repite hasta que el size sea 4 (el primer valor esta en la posicion 0)
             System.out.print("Número " + (numeros.size() + 1) + ": "); // como empieza por el 0, le sumo 1
             int numero = entrada.nextInt();
             if (numeros.contains(numero)) { // compruebo que el número no se repita, y si se repite le pido otro
                 System.out.println("Ese número ya lo has escrito. Ingresa otro.");
             } else { // si no está repetido añado el número
                 numeros.add(numero);
             }
         }
 
         // Calculamos la suma de los números

         for (int numero : numeros) { // recorro el hashset cogiendo cada valor dentro de numeros
             suma += numero; // lo mismo que suma=suma+numero, pero de forma abreviada
         }
 
         // Mostramos la suma
         System.out.println("La suma de los números es: " + suma);
 
         entrada.close();
     }
 }
