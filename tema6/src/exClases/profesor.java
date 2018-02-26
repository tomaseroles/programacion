/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exClases;

import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class profesor {
    private String nombre;
    private String apellidos;
    private int dni;
    
    profesor(){
        
    }
    
    profesor(String n, String a, int d){
        this.nombre=n;
        this.apellidos=a;
        this.dni=d;
    }
    
    public void Alta(){
    }
    
    public static void toString(profesor[] vecPr, int maximo){
        for(int i=0;i<maximo;i++){
            System.out.println(vecPr[i].mostrarInfoProfesor());
        }
    }
    
    public String mostrarInfoProfesor(){
        return "\tNombre: " + getNombre() + "\n\tApellidos: " + getApellidos() + "\n\tDNI: " + getDNI();
    }
    
    public void setNombre(String n){ this.nombre=n; }
    public void setApellidos(String a) {this.apellidos=a; }
    public void setDNI(int d) {this.dni=d;}
    
    public String getNombre(){return this.nombre;}
    public String getApellidos(){return this.apellidos;}
    public int getDNI(){return this.dni;}
}
