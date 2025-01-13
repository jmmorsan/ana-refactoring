package Actividades;
import java.util.*;
public class Actividad5 {
	
	public static double mediaPositivo(int [] numeros) {
		
		
		double mediaPositivo=0;
		int contnumPositivo=0;
		int sumaPositivos=0;
		
		
		for(int i=0; i < numeros.length; i++) {
			
			if (numeros[i] > 0) {
				contnumPositivo++;
				sumaPositivos += i;
					
		}
		
		mediaPositivo= (double)sumaPositivos/contnumPositivo;
			
	}
		
		return mediaPositivo;
}
	
	public static double mediaNegativo(int [] numeros) {
		
		double mediaNegativo = 0;
		
		int contnumNegativo=0;
		int sumaNegativos=0;
		
		
		for(int i=0; i < numeros.length; i++) {
			
			if (numeros[i] > 0) {
				contnumNegativo++;
				sumaNegativos += i;
		}
		
		mediaNegativo= (double)sumaNegativos/contnumNegativo;
			
	}
		return mediaNegativo;
}
	

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		
		System.out.println("Introduzca la cantidad de números(n): ");
		int n = sc.nextInt();
		
		int [] numeros = new int[n];
		
		int contCero=0;
		
		for(int i=0; i < numeros.length; i++) {
			System.out.println("Introduzca el número " + (i + 1) + ": ");
			numeros[i]=sc.nextInt();
			
			if (numeros[i] == 0) {
				contCero++;
			}
		}
		
		System.out.println("La media de números positivos introducidos es: " + mediaPositivo(numeros));
		System.out.println("La media de números negativos introducidos es: " + mediaNegativo(numeros));
		System.out.println("La cantidad de números 0 introducidos es: " + contCero);
	
	}

}
