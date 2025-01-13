package actividades;
import java.util.Scanner;

/**
 * Clase que permite al usuario introducir cinco números decimales y mostrarlos en el orden introducido.
 */
public class Actividad1 {

    public static void main(String[] args) {
        // Crear un escáner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declarar un arreglo para almacenar cinco números decimales
        double[] numeros = new double[5];

        // Solicitar al usuario los números decimales
        System.out.println("Introduzca 5 números decimales:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Número %d: ", i + 1);
            numeros[i] = scanner.nextDouble();
        }

        // Mostrar los números en el orden introducido
        System.out.println("\nNúmeros introducidos:");
        for (double numero : numeros) {
            System.out.println(numero);
        }

        // Cerrar el escáner
        scanner.close();
    }
}