package Actividades;
import java.util.*;
public class Actividad1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		double [] numeros = new double[5];
		
		//Solicitamos al usuario los cinco números decimales con un bucle
		
		System.out.println("Introduzca 5 números decimales: ");
		
		for(int i=0; i < numeros.length; i++) {
			System.out.println("Número " + (i+1) + ": ");
			numeros[i] = sc.nextDouble();
			
		}
		
		//Mostramos los números en el orden en el que se introducen usando un bucle for-each
		
		for(double numero : numeros) {
			System.out.println(numero);
		}
	}

}
