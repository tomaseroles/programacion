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
        float valor=0;
        
        do{
            opcion=Menu();
            if (c.activa && opcion>2){		//se puede acceder a la cuenta para hacer operaciones
                if(opcion==3){					//a�adir dinero
                    System.out.print("Introduce la cantidad a ingresar:");
                    c.Ingresar(sc.nextFloat());
                    System.out.println("");
                } else if(opcion==4){			//sacar dinero
                    System.out.print("Introduce la cantidad a retirar: ");
                    valor = sc.nextFloat();
                    if (c.getSaldo()<valor){
                        System.out.println("No se puede sacar " + valor + ". No hay dinero suficiente.");
                    } else{
                        c.Extraer(valor);
                    }
                    System.out.println("El saldo disponible es: " + c.getSaldo());
                } else if(opcion==5)
                    System.out.println("El saldo de la cuenta es: " + c.getSaldo());
            } else{				//no se puede hacer operaciones, hay que asignar un saldo inicial
                System.out.println("No se puede realizar esta operaci�n.\nLa cuenta no tiene saldo inicial.");
                System.out.print("Asigne un saldo inicial a la cuenta: ");
                c.Ingresar(sc.nextFloat());
                System.out.println("");
                c.activa=true;
            }
        }while(opcion!=6);
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
