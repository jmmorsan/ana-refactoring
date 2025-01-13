package Actividades;
import java.util.*;
public class Actividad2 {

	
	public static boolean esPrimo(int num) {
		
		boolean esPrimo=true;
		
			for(int j=2; j<num && esPrimo; j++) {
				if(num %j == 0) {
					esPrimo=false;
				}
			}
			
			return esPrimo;
			
		}
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		int tamanoArray = 100;
		
		int [] numerosPrimos = new int[tamanoArray];
		
		int indice=0;
		
		for(int i=1; i <= tamanoArray; i++) {
			if(esPrimo(i)) {
				numerosPrimos[indice] = i;
				indice ++;
			}
	}
		System.out.println("Números primos entre 1 y 100: ");
		for(int i=0; i < indice; i++) {
			System.out.println(numerosPrimos[i] + " ");
		}
	}
}
