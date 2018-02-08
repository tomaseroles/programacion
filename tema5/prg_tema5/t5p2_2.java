package prg_tema5;

import java.util.Scanner;

public class t5p2_2 {

	static float a;
	static float b;
	static float c;
	static float x[] = new float[2];
	
	public static void main(String[] args) {
		/*
		 *  Ecuacion de segundo grado por funciones
		 *  Metodo 2
		 */
		
		System.out.println("Ecuaciones de segundo grado");
		entrarCoeficientes();
		if(Discriminante()<0)
			System.out.println("No se puede calcular la solución de la ecuación porque el discriminante es menor que cero.");
		else {
			x=Soluciones();
			System.out.println("Las soluciones a la E2G son: ");
			System.out.println("\tx1 = " + x[0]);
			System.out.println("\tx2 = " + x[1]);
		}		
	}
	
	public static float[] Soluciones() {
		x[0] = (float) ((-b+Math.sqrt(Discriminante()))/(2*a));
		x[1] = (float) ((-b-Math.sqrt(Discriminante()))/(2*a));
		return x;
	}
	public static float Discriminante() {
		return (float)(b*b-4*a*c);
		
	}
	public static void entrarCoeficientes() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrar el valor de a: ");
		a=(float)sc.nextInt();
		System.out.print("Entrar el valor de b: ");
		b=(float)sc.nextInt();
		System.out.print("Entrar el valor de c: ");
		c=(float)sc.nextInt();
		
		sc.close();
	}
}
