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
        profesor p1 = new profesor();
        p1.setNombre();
        p1.setEdad();
        p1.setConsolidados();
        
        System.out.println(p1.toString());
        
        emerito p2 = new emerito();
        p2.setNombre();
        p2.setEdad();
        p2.setConsolidados();
        
        System.out.println(p2.toString());
        sc.close();
        
    }
}
