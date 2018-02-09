/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

/**
 *
 * @author tomfor
 */
public class p8 {
    public static void main(String[] args){
        multimedia m = new multimedia("Pulp Fiction", "Tarantino", "BlueRay", 120);
        pelicula q = new pelicula(m, "John Travolta", "Uma Thurman");
        System.out.println(q.toString());
        
        
    }
}
