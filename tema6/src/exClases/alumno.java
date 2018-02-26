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
public class alumno {
    private String nombre;
    private String apellidos;
    private int telfContacto;
    private String direccion;
    
    //constructores
    alumno(){
    }
    
    alumno(String n, String a, int t, String d){
        this.nombre=n;
        this.apellidos=a;
        this.telfContacto=t;
        this.direccion=d;
    }
    
    //sobrecarga de toString
    public static void toString(alumno[] vecAl, int maximo){
        for(int i=0;i<maximo;i++){
            System.out.println(vecAl[i].mostrarInfoAlumno());
        }
    }
    
    //metodo mostrarInfoAlumno: imprime la ficha de un alumno
    public String mostrarInfoAlumno(){
        return "\tNombre : " + getNombre() + "\n\tApellidos: " + getApellidos() + "\n\tTelefono: " + getTelefono()+  "\n\tDireccion: " + getDireccion();
    }
    
    //lista de setters
    public void setNombre(String n){ this.nombre=n; }
    public void setApellidos(String a){ this.apellidos=a; }
    public void setTelefono(int telf){ this.telfContacto=telf; }
    public void setDireccion(String dir){ this.direccion=dir; }
    
    //lista de getters
    public String getNombre() { return this.nombre; }
    public String getApellidos() { return this.apellidos; }
    public int getTelefono() { return this.telfContacto; }
    public String getDireccion() { return this.direccion; }
}
