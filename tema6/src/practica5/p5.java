/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;
import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class p5 {
    public static void main(String[] args){
        
    }

    public int Menu(){
        int opcion=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculadora");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Producto");
        System.out.println("4.Cociente");
        System.out.println("5.Raiz cuadrada");
        System.out.println("6.Potencia");
        System.out.println("7.Finalizar");
        System.out.print("\nOpcion: ");
        opcion = sc.nextInt();
        return opcion;
    }
}
