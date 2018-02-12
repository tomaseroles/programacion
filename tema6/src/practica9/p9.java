/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

import java.util.Scanner;

/**        super.activa=true;

 *
 * @author tomfor
 */
public class p9 {
    public static void main(String[] args){
        CuentaClave cta = new CuentaClave(1000,"miclave");
        int opcion = Menu();
        do{
            if(opcion==4){
                
            }
            opcion=Menu();
        }while(opcion!=6);
        
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
