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
    private static String marca;
    private static String modelo;
    private static String procesador;
    private static boolean OrdenadorEncendido;
    private static boolean pantalla;
    
    
    public static boolean getEstado(){
        return OrdenadorEncendido;
    }
    
    public static void Encender(){
        OrdenadorEncendido=true;
    }
    
    public static void Apagar() {
        OrdenadorEncendido=false;
    }
    
    public static boolean getPantalla(){
        return pantalla;
    }
    
    public static void DesactPantalla(){
        pantalla=false;
    }
    
    public static void ActivPantalla(){
        pantalla=true;
    }
    
    public static void setMarca(String nMarca){
        marca = nMarca;
    }
    
    public static String getMarca(){
        return marca;
    }
    
    public static void setModelo(String mod){
        modelo=mod;
    }
    
    public static String getModelo(){
        return modelo;
    }
    
    public static void setProces(String proc){
        procesador=proc;
    }
    
    public static String getProces(){
        return procesador;
    }
    
    public static void Estado(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Procesador: " + getProces());
        if (getEstado())
            System.out.println("Esta encendido");
        else
            System.out.println("Esta apagado");
        if(getPantalla())
            System.out.println("Pantalla encendida");
        else
            System.out.println("Pantalla apagada");
    }
}
