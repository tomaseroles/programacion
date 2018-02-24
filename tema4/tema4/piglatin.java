package tema4;

import java.util.Scanner;

public class piglatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada;
		Scanner sc = new Scanner(System.in);
		int i=0;
		char caracter;
		
		
		System.out.print("\nGenerador Pig Latin.");
		System.out.print("\n--------------------\n");
		System.out.print("\nEntra un texto de una linea:");
		entrada = sc.nextLine();
		
		char vector[] = new char[entrada.length()];
		char vcplat[] = new char[entrada.length()+10];
		
		//paso de la cadena de entrada al vector
		for (i=0;i<entrada.length();i++) {
			vector[i] = entrada.charAt(i);
		}
		
		for (i=0;i<entrada.length();i++) {
			if (vector[i]==32) {
				
			}
		}
		sc.close();
	}

}
