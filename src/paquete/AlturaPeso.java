package paquete;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class AlturaPeso {

	public static void main(String[] args) {
		int altura = 0;
		int peso = 0;
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Introduce tu altura en cm");
			altura = Integer.parseInt(scan.nextLine());
			altura = altura/10;
			System.out.println("Introduce tu peso en kg");
			peso = Integer.parseInt(scan.nextLine());
			
			int imc = peso/(altura^2);
			if(imc<5){
				System.out.println("Estas flaco");
				
			}else{
				System.out.println("Estas gordito");
			}
			
		}
		
	catch (NullPointerException ex){
		// se ejecuta cuando es null
		System.err.println("Alguna variable es nula --> Error: " + ex.getMessage()); 
	} catch(NumberFormatException ex){
		// se ejecuta si el string no es un numero
		System.err.println("El string no es un n�mero --> Error: " + ex.getMessage());
		}
	}
}