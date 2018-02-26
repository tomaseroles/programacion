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
public class asignatura {
    String nombre;
    int creditos;
    int dniProfesor;
    
    asignatura(){
        
    }
    
    asignatura(String nombre, int creditos, int profesor){
        this.nombre=nombre;
        this.creditos=creditos;
        this.dniProfesor=profesor;
    }
    
    public String getNombre(){return this.nombre;}
    public int getCreditos() {return this.creditos;}
    public int getDniProfe() {return this.dniProfesor;}
    
    public void setNombre(String n){this.nombre=n; }
    public void setCreditos(int cr){this.creditos=cr;}
    public void setdniProf(int dni){this.dniProfesor=dni;}
    
    public static void toString(asignatura[] as, int maximo){
        for(int i=0;i<maximo;i++)
            System.out.println(as[i].infoAsignatura());
    }
    
    public String infoAsignatura(){
        return "\tNombre: " + getNombre() + "\n\tCreditos: " + getCreditos() + "\n\tDNI Profesor: " + getDniProfe();
    }
    
}
