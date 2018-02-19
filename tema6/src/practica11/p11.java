/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class p11 {
    Scanner sc = new Scanner(System.in);
    
    public void main(String[] args){
        circulo p= new circulo();
        int op;
        op=menu();
        
    }
    
    public  int menu(){
        int op;
        System.out.print("\nMenu de opciones. Calculo de areas.");
        System.out.print("\n1.Area del triangulo");
        System.out.print("\n2.Area del cuadrado");
        System.out.print("\n3.Area del circulo");
        System.out.print("\n4.Salir");
        System.out.print("\nOpcion: ");
        op=sc.nextInt();
        return op;
    }
}
