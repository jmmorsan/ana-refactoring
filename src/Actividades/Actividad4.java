package Actividades;
import java.util.*;
public class Actividad4 {

	public static int sumaNumeros(int [] numeros) {
		
		int suma = numeros[0];
		for(int i =0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		
		return suma;
		
	}
		
	public static int restaNumeros(int [] numeros) {
		
		int resta = numeros[0];
		for(int i =0; i < numeros.length; i++) {
			resta -= numeros[i];
		}
		
		return resta;
		
	}
	
	public static double multiplicacionNumeros(int [] numeros) {
		
		double multiplicacion = numeros[0];
		
		
		for(int i =0; i < numeros.length; i++) {
			
			if(numeros[i] == 0) {
				System.out.println("Error");
				
			}else {
				multiplicacion *= numeros[i];
			}
			
		}
		
		return multiplicacion;
	}
		
	public static double divisionNumeros(int [] numeros) {
		
		double division = numeros[0];
		
		
		for(int i =0; i < numeros.length; i++) {
			
			if(numeros[i] == 0) {
				System.out.println("Error");
				
			}else {
				division /= numeros[i];
			}
			
		}
		
		return division;
	}
		
	
	
	
	public static void main(String[] args) {
		var sc = new Scanner (System.in);
		
		//Solicitamos la cantidad de números del array y lo creamos para almacenar
		System.out.println("Introduzca la cantidad de números (n): ");
		int n = sc.nextInt();
		
		int [] numeros = new int[n];
		
		
		//Solicitamos al usuario los números
		for(int i=0; i < n; i++) {
			System.out.print("Introduzca el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
			
			System.out.println("La suma de los números introducidos es: " + sumaNumeros(numeros));
			System.out.println("La resta de los números introducidos es: " + restaNumeros(numeros));
			System.out.println("La multiplicación de los números introducidos es: " + multiplicacionNumeros(numeros));
			System.out.println("La división de los números introducidos es: " + divisionNumeros(numeros));
			
			
		}
			
		
	}

}
