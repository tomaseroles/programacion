/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class profesor {
    Scanner sc = new Scanner(System.in);
    
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
    
    @Override  public String toString(){
        return this.nombre + ", " + this.edad + ", " + this.consolidados + ", " + SalarioBase();
    }
    
    public void setNombre(){
        System.out.print("Nombre del profesor:");
        nombre = sc.nextLine();
    }
    
    public String getNombre(){return nombre;}
    public int getEdad(){return edad;}
    public int getCons(){return consolidados;}
    
    public void setEdad(){
        System.out.print("Entra la edad: ");
        edad = sc.nextInt();
    }
    
    public void setCons(){
        System.out.print("Años consolidados: ");
        consolidados = sc.nextInt();
    }
}
