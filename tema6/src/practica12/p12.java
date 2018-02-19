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
        char sexo;
        double peso;
        int altura;
        
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Sexo: ");
        sexo = sc.nextLine().charAt(0);
        System.out.print("Peso: ");
        peso = sc.nextDouble();
        System.out.print("Altura: ");
        altura = sc.nextInt();
        
        
        persona v[]= new persona[3];
        
        v[0]=new persona();
        v[0].setNombre(nombre);
        v[0].setSexo(sexo);
        v[0].setPeso(peso);
        v[0].setAltura(altura);
        
        v[1]=new persona();
        v[1].setNombre(nombre);
        v[1].setSexo(sexo);
        v[1].getPeso();
        v[1].getAltura();
        
        v[2]=new persona();
        v[2].getNombre();
        v[2].getSexo();
        v[2].getPeso();
        v[2].getAltura();
        
        
        v[0].toString();
        v[1].toString();
        v[2].toString();
        
        
    }
}
