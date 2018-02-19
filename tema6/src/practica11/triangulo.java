/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class triangulo extends poligono{
    
    Scanner sc = new Scanner(System.in);
    
    private int base;
    private int altura;
    
    public triangulo(){
        
    }
    
    public void getBase(){
        System.out.print("Entra la base: ");
        this.base = sc.nextInt();
    }

    public void getAltura(){
        System.out.print("Entra la altura: ");
        this.altura = sc.nextInt();
    }
    
    public triangulo(int b, int a){
        this.base=b;
        this.altura=a;
    }
    
    public double area(){
        return (float)(base*altura)/2;
    }
    
    public String toString(){
        return("Area del triangulo: " + area());
    }
}
