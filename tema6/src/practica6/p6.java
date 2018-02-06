/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;
import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class p6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        cuenta c = new cuenta();
        int opcion=0;
        do{
            opcion=Menu();
            
            
            if(opcion<2){
                if(c.activa){
                    System.out.println("No se puede crear la cuenta, ya esta creada.");
                } else{
                    System.out.print("Introduzca el saldo inicial:");
                    c.Ingresar(sc.nextFloat());
                }
            } else{
                if(c.activa){
                    if (opcion==3){
                        System.out.println("Cantidad a ingresar:");
                        c.Ingresar(sc.nextFloat());
                    } else if(opcion==4){
                        System.out.println("Cantidad a retirar:");
                        c.Extraer(sc.nextFloat());
                    }
                }
            }
        } while(opcion!=6);
        sc.close();
    }
    
    private static int Menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cajero automatico");
        System.out.println("1. Crear cuenta vacia");
        System.out.println("2. Crear cuenta con saldo");
        System.out.println("3. Ingresar dinero");
        System.out.println("4. Sacar dinero");
        System.out.println("5. Ver saldo");
        System.out.println("6. Salir");
        System.out.println("Elegir opcion:");
        return (sc.nextInt());
    }
    
}
