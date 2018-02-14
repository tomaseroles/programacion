/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

import java.util.Scanner;

public class profesor {
	Scanner sc=new Scanner(System.in);

    private String nombre;
    private int edad;
    private int consolidados;
    
    public profesor(){
        
    }
    
    public profesor(String n, int e, int c){
        this.nombre=n;
        this.edad=e;
        this.consolidados=c;
    }
    
    public String toString(){
    	return "Nombre: " + this.nombre + ". Edad: " + this.edad + ". A.Consol.: " + this.consolidados + ". Salario Base: " + SalarioBase();
    }
    
    public double SalarioBase(){
        return (725+this.consolidados*33.25);
    }
    
    public void setNombre(){
    	System.out.println("Nombre del profesor: ");
    	this.nombre=sc.nextLine();
    }
    
    public void setEdad(){
    	System.out.println("Edad del profesor: ");
    	this.edad = sc.nextInt();
    }
    
    public void setConsolidados(){
    	System.out.println("Consolidados?: ");
    	this.consolidados=sc.nextInt();
    }
    
    public int getConsolidados(){
    	return this.consolidados;
    }
    
    public int getEdad(){
    	return this.edad;
    }
    
    public String getNombre(){
    	return this.nombre;
    }
}
