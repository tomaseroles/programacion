/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;
//import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class cuenta {
    private float Saldo;		//indica el saldo de la cuenta en cada momento
    boolean activa;				//indica si la cuenta est� activa o no. Cuando se crea con el constructor por defecto no est� activa
    
    public cuenta(float sini) {
        activa=true;
        Saldo = sini;
    }

    public cuenta() {
        activa=false;
        Saldo=0;
    }
    
    public void Ingresar(float valor){
        Saldo=Saldo+valor;
    }
    
    public void Extraer(float c){
        Ingresar(-c);
    }
    
    public float getSaldo(){
        return Saldo;
    }
    
    //metodos añadidos por la practica 9
    public boolean getStatus(){
        return activa;
    }
    
    public void Activar(){
        activa=true;
    }
}
