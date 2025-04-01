import java.util.HashSet;
 import java.util.Scanner;
 
 public class Suma {
 
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

         HashSet<Integer> numeros = new HashSet<>();
 
         // Pedimos que escriban 5 números diferentes
         System.out.println("Ingresa 5 números diferentes:");
         while (numeros.size() < 5) {
             System.out.print("Número " + (numeros.size() + 1) + ": ");
             int numero = entrada.nextInt();
             if (numeros.contains(numero)) {
                 System.out.println("Ese número ya lo has escrito. Ingresa otro.");
             } else {
                 numeros.add(numero);
             }
         }
 
         // Calculamos la suma de los números
         int suma = 0;
         for (int numero : numeros) {
             suma += numero;
         }
 
         // Mostramos la suma
         System.out.println("La suma de los números es: " + suma);
 
         entrada.close();
     }
 }
