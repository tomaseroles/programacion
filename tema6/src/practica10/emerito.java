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
public class emerito extends profesor {
    private int aEmerito;
    
    public emerito(){
        
    }
    
    public emerito(profesor pr, int ae){
        
    }
    
    @Override public double SalarioBase(){
        return super.SalarioBase()+47.80*this.aEmerito;
    }
    
    @Override public String toString(){
        return super.toString() + "--" + aEmerito + SalarioBase();
    }
    
    public void setAnEm(){
        System.out.print("Años emerito: ");
        aEmerito=sc.nextInt();
    }
}

