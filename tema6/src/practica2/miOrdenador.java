/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class miOrdenador {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        COrdenador miord = new COrdenador();
        
        System.out.println("Marca: ");
        miord.setMarca(sc.nextLine());
        System.out.println("Modelo: ");
        miord.setModelo(sc.nextLine());
        System.out.println("Procesador");
        miord.setProces(sc.nextLine());
        
        miord.Estado();
        miord.Encender();
        miord.Estado();
        
    }
}
