/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author tomfor
 */
public class cCalculadora {
    private int pantalla;
    
    public cCalculadora(){Inicializar();}
    public cCalculadora(int Valor){pantalla = Valor;}
    
    public void Inicializar(){ pantalla=0;}
    public void Sumar(int numero){
        pantalla=pantalla+numero;
        Mostrar();
    }
    public void Restar(int numero){
        pantalla=pantalla-numero;
        Mostrar();
    }
    public void Multiplicar(int numero){
        pantalla=pantalla*numero;
        Mostrar();
    }
    public void Dividir(int numero){
        pantalla=pantalla/numero;
        Mostrar();
    }
    public void Raiz(){
        pantalla=(int)Math.sqrt((double)(pantalla));
        Mostrar();
    }
    public void Potencia(int exponente){
        pantalla=(int)Math.pow((double)pantalla, (double)exponente);
        Mostrar();
    }
    public void Mostrar(){
        System.out.println("Pantalla:\t\t\t\t" + pantalla);
    }
    
}

