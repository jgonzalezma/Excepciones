package paquete;

import java.util.Scanner;

public class AlturaPeso {
	static int altura;
	static int peso;
	//static Scanner scan = new Scanner(System.in);
	
	public static void calcularImc2(String altura_str, String peso_str) throws NullPointerException, NumberFormatException{
		
		int altura = Integer.parseInt(altura_str);
		int peso = Integer.parseInt(peso_str);
		
		if(altura <= 0){
			//System.out.println("El numero no puede ser 0 o menos");
			calcularImc2(peso_str, peso_str);
		}else{
		altura = altura/10;
		if(peso <= 0){
			//System.out.println("El numero no puede ser 0 o menos");
			calcularImc2(peso_str, peso_str);
		}else{
		
		int imc = peso/(altura^2);
		if(imc<5){
			//System.out.println("Estas flaco");
			
		}else{
			//System.out.println("Estas gordito");
		}
	}}
	}
}
