/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author tomfor
 */
public class COrdenador {
    String marca;
    static String modelo;
    
    static boolean OrdenadorEncendido;
    static boolean pantalla;
    
    public static void Encender(){
        OrdenadorEncendido=true;
    }
    
    public static void Apagar() {
        OrdenadorEncendido=false;
    }
    
    public static void DesactPantalla(){
        pantalla=false;
    }
    
    public static void ActivPantalla(){
        pantalla=true;
    }
    
    public static void setMarca(String nMarca){
        //marca = nMarca;
    }
    
    
    public static void Estado(){
        //System.out.println("Marca: " + marca);
        //System.out.println("Modelo: " + modelo);
    }
}
