/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

/**
 *
 * @author tomfor
 */
public class profesor {
    private String nombre;
    private int edad;
    private int consolidados;
    
    public void profesor(){
        
    }
    
    public void profesor(String n, int e, int c){
        this.nombre=n;
        this.edad=e;
        this.consolidados=c;
    }
    
    public double SalarioBase(){
        return (725+this.consolidados*33.25);
    }
}
