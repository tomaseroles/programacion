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
    private String pantalla;
    private int v1;
    private int v2;
    
    public cCalculadora(){Iniciar();}
    public cCalculadora(int Valor){
        pantalla = Integer.toString(Valor) ;
    }
    
    public void Iniciar(){ pantalla="0";}
    public void Iniciar(int valor){
        pantalla=Integer.toString(valor);
    }
    public String Valor(){
        return pantalla;
    }
    public void Sumar(){
        pantalla="Suma: \t\t" + Integer.toString(v1+v2);
    }
    public void Restar(){
        pantalla="Resta:\t\t" + Integer.toString(v1-v2);
    }
    public void Multiplicar(){
        pantalla="Producto:\t\t"+ Integer.toString(v1*v2);
    }
    public void Dividir(){
        pantalla="Cociente:\t\t" + Integer.toString(v1/v2);
    }
    public void Raiz(){
        pantalla="Raiz cuadrada:\t" + Double.toString(Math.sqrt((double)(v1)));
    }
    public void Potencia(){
        pantalla="Potencia:\t\t"+ Integer.toString((int)Math.pow((double)v1, (double)v2));
    }
    public void Mostrar(){
        System.out.println("" + pantalla);
    }
    
    public void set1(int valor){
        v1=valor;
    }
    
    public void set2(int valor){
        v2=valor;
    }
}

