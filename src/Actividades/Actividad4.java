package Actividades;
import java.util.*;

public class Actividad4 {

    public static int sumaNumeros(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    public static int restaNumeros(int[] numeros) {
        int resta = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resta -= numeros[i];
        }
        return resta;
    }

    public static double multiplicacionNumeros(int[] numeros) {
        double multiplicacion = 1;
        boolean error = false;
        for (int num : numeros) {
            if (num == 0) {
                System.out.println("Error: multiplicación por 0");
                error = true;
                break;
            } else {
                multiplicacion *= num;
            }
        }
        return error ? 0 : multiplicacion;
    }

    public static double divisionNumeros(int[] numeros) {
        double division = numeros[0];
        boolean error = false;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                System.out.println("Error: división por 0");
                error = true;
                break;
            } else {
                division /= numeros[i];
            }
        }
        return error ? 0 : division;
    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de números (n): ");
        int n = sc.nextInt();
        
        int[] numeros = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Introduzca el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Realizamos los cálculos una sola vez después de tomar todos los números.
        System.out.println("La suma: " + sumaNumeros(numeros));
        System.out.println("La resta: " + restaNumeros(numeros));
        System.out.println("La multiplicación: " + multiplicacionNumeros(numeros));
        System.out.println("La división: " + divisionNumeros(numeros));
    }
}