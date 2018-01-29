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
public class persona {
    char sexo;
    String nombre;
    int edad;
    Coche coche;
    
    void saludar() {
        System.out.println("Hola, me llamo " + this.nombre);
    }
    
    void dormir() {
        System.out.println("Zzzzzzzzzzz");
    }
    
    int getEdad() {
        return this.edad;
    }
}
