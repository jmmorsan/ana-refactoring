package Actividades;
import java.util.*;
public class Actividad3 {

	public static void main(String[] args) {
		var sc = new Scanner (System.in);
		
		System.out.println("¿Cuántos números desea introducir?: ");
		int cantidad = sc.nextInt();
		
		int [] numeros = new int[cantidad];
		
		System.out.println("Introduzca " + cantidad + " números enteros: ");
		
		for(int i = 0; i < cantidad; i++) {
			System.out.println("Número " + (i+1) + ": ");
			numeros[i] = sc.nextInt();
		}
		
		Arrays.sort(numeros);
		
		//Mostrar los números en orden inverso
		System.out.println("Los números introducidos en el orden inverso son: ");
		for(int i = cantidad -1; i > 0; i--) {
			System.out.println(numeros[i]);
		}
	}

}
