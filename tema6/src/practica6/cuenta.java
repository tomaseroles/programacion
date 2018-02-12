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
    private float Saldo;		//indica el saldo de la cuenta en cada momento
    boolean activa;				//indica si la cuenta est� activa o no. Cuando se crea con el constructor por defecto no est� activa
    
    cuenta(float sini) {
        activa=true;
        Saldo = sini;
    }

    cuenta() {
        activa=false;
        Saldo=0;
    }
    
    void Ingresar(float valor){
        Saldo=Saldo+valor;
    }
    
    void Extraer(float c){
        Ingresar(-c);
    }
    
    float getSaldo(){
        return Saldo;
    }
}
