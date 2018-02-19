package practica10;

import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class p10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        profesor p = new profesor();
        
        p.setNombre();
        p.setEdad();
        p.setCons();
        System.out.println(p.toString());
        
        
        emerito q = new emerito();
        
        q.setNombre();
        q.setEdad();
        q.setCons();
        q.setAnEm();
        
        System.out.print(q.toString());
        System.out.println();
    }
}
