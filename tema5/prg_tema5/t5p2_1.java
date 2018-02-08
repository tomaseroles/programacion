package prg_tema5;

import java.util.Scanner;

public class t5p2_1 {

	static float x[] = new float[2];
	
	public static void main(String[] args) {
		/*
		 *  Ecuacion de segundo grado por funciones
		 *  Metodo 1
		 */
		
		float a;
		float b;
		float c;

		System.out.println("Ecuaciones de segundo grado");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrar el valor de a: ");
		a=(float)sc.nextInt();
		System.out.print("Entrar el valor de b: ");
		b=(float)sc.nextInt();
		System.out.print("Entrar el valor de c: ");
		c=(float)sc.nextInt();
		
		sc.close();

		if(Discriminante(a,b,c)<0)
			System.out.println("No se puede calcular la solución de la ecuación porque el discriminante es menor que cero.");
		else {
			x=Soluciones(a,b,c);
			System.out.println("Las soluciones a la E2G son: ");
			System.out.println("\tx1 = " + x[0]);
			System.out.println("\tx2 = " + x[1]);
		}		
	}
	
	public static float[] Soluciones(float a, float b, float c) {
		x[0] = (float) ((-b+Math.sqrt(Discriminante(a,b,c)))/(2*a));
		x[1] = (float) ((-b-Math.sqrt(Discriminante(a,b,c)))/(2*a));
		return x;
	}
	
	public static float Discriminante(float a, float b, float c) {
		return (float)(b*b-4*a*c);
	}
	
}
