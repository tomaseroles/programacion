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
    private static String dni;
    private static String nom;
    private static short edad;
    
    public static void cPersona(){
        
    }
    
    public static void cPersona(String dni, String nom, short edad){
        setDNI(dni);
        setNom(nom);
        setEdad(edad);
    }
    
    public static void setDNI(String ndni){
        dni = ndni;
    }
    
    public static void setNom(String nombre){
        nom=nombre;
    }
    
    public static void setEdad(short age){
        edad = age;
    }
    
    public static String getDNI(){
        return dni;
    }
    
    public static String getNom(){
        return nom;
    }
    
    public static short getEdad(){
        return edad;
    }
    
    public static void Presentar(){
        System.out.println("DNI: " + getDNI());
        System.out.println("Nom: " + getNom());
        System.out.println("Edad:" + getEdad());
    }
    
}
