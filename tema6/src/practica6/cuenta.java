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
public class cuenta {
    private float Saldo;
    boolean activa;
    cuenta(float sini) {
        activa=true;
        Saldo = sini;
        System.out.println("Saldo de la cuenta: " + getSaldo());        
    }

    cuenta() {
        activa=true;
        Saldo=0;
    }
    
    void Ingresar(float c){
        if(!activa) activa=true;
        Saldo=Saldo+c;
        System.out.println("Saldo de la cuenta: " + getSaldo());
    }
    
    void Extraer(float c){
        Scanner sc=new Scanner(System.in);
        if (c>Saldo){
            System.out.print("\nEsta operacion dejara la cuenta con descubierto");
        } else
            Saldo = Saldo - c;
        sc.close();
        System.out.println("Saldo de la cuenta: " + getSaldo());        
    }
    
    float getSaldo(){
        return Saldo;
    }
}
