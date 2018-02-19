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
public class circulo extends poligono {
    private double PI=3.1416;
    private double radio;
    
    Scanner sc = new Scanner(System.in);
    
    public circulo(){
        
    }
    
    public circulo(double radio){
        this.radio=radio;
    }
    
    public double area(){
        return PI*radio*radio;
    }
    
    public void setRadio(){
        double radio;
        System.out.print("Radio del circulo: ");
        this.radio = sc.nextDouble();
    }
}
