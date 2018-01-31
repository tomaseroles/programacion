/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.util.HashSet;

/**
 *
 * @author tomfor
 */
public class p4 {
    public static void main(String[] args){
        cCoche c1 = new cCoche();
        cCoche c2 = new cCoche("azul electrico", "volkswagen", "tiptronic", 6);
        
        c1.setMarca("Renault");
        c1.setColor("Gris perla");
        c1.setTipo("Espace 140cv");
        
        c1.Describir();
        c1.Arrancar();
        System.out.println("Punto muerto");
        for (int i=0;i<=6;i++){
            
            c1.Acelerar();
            c1.SubirMarcha();
        }
        
        System.out.println("Velocidad de crucero.");
     
        c2.Describir();
    }
}
