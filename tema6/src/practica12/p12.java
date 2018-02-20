/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12;

import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class p12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        String sSexo;
        char sexo;
        double peso;
        int altura;
        
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Edad: ");
        edad=sc.nextInt();
        System.out.print("Sexo: ");
        sSexo = sc.nextLine();
        sSexo = sc.nextLine();
        sexo = sSexo.charAt(0);
        System.out.print("Peso: ");
        peso = sc.nextDouble();
        System.out.print("Altura: ");
        altura = sc.nextInt();
        
        persona p1 = new persona();
        persona p2 = new persona(nombre,edad,sexo);
        persona p3 = new persona(nombre, edad, sexo, peso, altura);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
    }
}
