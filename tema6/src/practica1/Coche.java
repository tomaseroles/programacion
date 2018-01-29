/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author tomfor
 */
public class Coche {
    String marca;
    String modelo;
    String color;
    int puertas;
    int kilometros;
    int velocidad;
    boolean arrancado;
    
    void arrancar() {
        this.arrancado=true;
    }
    
    void parar() {
        this.arrancado=false;
    }
    
    void acelerar(){
        this.velocidad++;
    }
    
    void frenar() {
        this.velocidad--;
    }
    
    void pitar() {
        System.out.print("Piiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiip!!");
    }
    
    int cuentakm(){
        return this.kilometros;
    }
}
