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
    private profesor profe;
    
    public emerito(){
        
    }
    
    public emerito(profesor pr, int ae){
        this.profe=pr;
        this.aEmerito=ae;
    }
    
    public void setProfe(profesor p){
        this.profe=p;
    }
    
    public void setAE(){
    	System.out.println("Años emerito: ");
    	this.aEmerito=sc.nextInt();
    }
    
    @Override public double SalarioBase(){
        return super.SalarioBase()+47.80*this.aEmerito;
    }
    
    public void setAnhos(int a){
    	this.aEmerito=a;
    }
    
    public int getAnhos(){
    	return this.aEmerito;
    }
    
    @Override public String toString(){
    	return super.toString()+". Años Em.: " + getAnhos() + ". Salario: " + this.SalarioBase();
    }
}

