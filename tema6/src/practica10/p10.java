/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class p10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Profesor 1:");
        profesor p1 = new profesor();
        p1.setNombre();
        p1.setEdad();
        p1.setConsolidados();
        
        System.out.println(p1.toString());

        System.out.println("Profesor 2:");
        profesor p2 = new profesor("Juan", 25, 15);
        System.out.println(p2.toString());
        
        emerito p3 = new emerito();
        p3.setProfe(p2);
        p3.setAE();
        
        System.out.println(p3.toString());
        sc.close();
        
    }
}
