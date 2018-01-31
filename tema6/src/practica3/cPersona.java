/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author tomfor
 */
public class cPersona {
    private String dni;
    private String nom;
    private int edad;
    
    public cPersona(){
    }
    
    public cPersona(String dni, String nom, int edad){
        setDNI(dni);
        setNom(nom);
        setEdad(edad);
    }
    
    public void setDNI(String ndni){
        dni = ndni;
    }
    
    public void setNom(String nombre){
        nom=nombre;
    }
    
    public void setEdad(int age){
        edad = age;
    }
    
    public String getDNI(){
        return dni;
    }
    
    public String getNom(){
        return nom;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public  void Presentar(){
        System.out.println("DNI: " + getDNI());
        System.out.println("Nom: " + getNom());
        System.out.println("Edad:" + getEdad());
    }
    
}
