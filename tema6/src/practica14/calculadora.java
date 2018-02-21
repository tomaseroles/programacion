/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica14;

/**
 *
 * @author tomfor
 */
public class calculadora extends practica5.cCalculadora{
    public calculadora(){
        super.Iniciar(0);
    }
    
    public int Sumar(int a, int b){
        return a+b;
    }
    
    public int Sumar (int a, int b, int c){
        return a+b+c;
    }
    
    public double Sumar(double a, double b){
        return a+b;
    }
    
    public double Sumar(double a, double b, double c){
        return a+b+c;
    }
    
    public int Restar(int a, int b){
        return a-b;
    }
    
    public int Restar(int a, int b, int c){
        return (a-b)-c;
    }
    
    public double Restar(double a, double b){
        return a-b;
    }
    
    public double Restar(double a, double b, double c){
        return a-b-c;
    }
    
    public int Multiplicar(int a, int b){
        return a*b;
    }
    
    public int Multiplicar(int a, int b, int c){
        return a*b*c;
    }
    
    public double Multiplicar (double a, double b){
        return a*b;
    }
    
    public double Multiplicar(double a, double b, double c){
        return a*b*c;
    }
}
