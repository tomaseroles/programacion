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
public class p6_3 {
    public static void main(String[] args){
        cPersona per1 = new cPersona();
        cPersona per2 = new cPersona("123456","pepito", 23);


        per1.setNom("Tomas");
        per1.setDNI("18993950K");
        per1.setEdad(43);
        
        per1.Presentar();
        per2.Presentar();
    }
    
}
