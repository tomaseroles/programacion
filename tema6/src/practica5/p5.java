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
        Scanner sc = new Scanner(System.in);
        cCalculadora p = new cCalculadora();
        int op=0;
          
        op = Menu();
        while(op!=7) {
            System.out.print(">");
            p.set1(sc.nextInt());
            if(op!=5) {
                System.out.print(">");
                p.set2(sc.nextInt());
            }
            switch (op){
                case 1:
                    p.Sumar();
                    break;
                case 2:
                    p.Restar();
                    break;
                case 3:
                    p.Multiplicar();
                    break;
                case 4:
                    p.Dividir();
                    break;
                case 5:
                    p.Raiz();
                    break;
                case 6:
                    p.Potencia();
                    break;
            }
            p.Mostrar();
            op = Menu();
        }
        System.out.println("Final");
    }

    private static int Menu(){
        int opcion=0;
        Scanner sc = new Scanner(System.in);
        
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
