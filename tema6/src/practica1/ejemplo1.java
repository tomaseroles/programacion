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
public class ejemplo1 {
    public static void main(String[] args){
        Coche coche1 = new Coche();
        persona pers1 = new persona();
        persona pers2 = new persona();
        
        coche1.marca="Seat";
        coche1.modelo="Panda";
        coche1.color="Beige";
        coche1.puertas=3;
        coche1.kilometros=21000;
        coche1.velocidad=0;
        coche1.arrancado=false;
        
        pers1.sexo='F';
        pers1.nombre = "Marta";
        pers1.edad = 32;
        pers1.coche = coche1;

        pers2.nombre = "Raimundo";
        
        System.out.println(coche1.marca);
        System.out.println(coche1.modelo);
        System.out.println(coche1.color);
        System.out.println(coche1.puertas);
        System.out.println(coche1.cuentakm());
        System.out.println(coche1.velocidad);
        System.out.println(coche1.arrancado);

        System.out.println(pers1.sexo);
        System.out.println(pers1.nombre);
        System.out.println(pers1.edad);
        System.out.println(pers1.coche);
        System.out.println(pers1.coche.marca);
        System.out.println(pers1.coche.modelo);

        System.out.println(pers2.sexo);
        System.out.println(pers2.nombre);
        System.out.println(pers2.edad);
        System.out.println(pers2.coche);

        coche1.arrancar();
        System.out.println(coche1.arrancado);
        coche1.acelerar();
        System.out.println(coche1.velocidad);
        coche1.acelerar();
        System.out.println(coche1.velocidad);    
        coche1.acelerar();
        System.out.println(coche1.velocidad);    
        coche1.frenar();
        System.out.println(coche1.velocidad);    
        coche1.frenar();
        System.out.println(coche1.velocidad);    
        coche1.frenar();
        System.out.println(coche1.velocidad);
        coche1.parar();
        System.out.println(coche1.arrancado);
        coche1.pitar();
        coche1.cuentakm();

        pers1.saludar();
        pers1.getEdad();
        pers2.saludar();
        pers2.getEdad();
        pers1.dormir();
        pers2.dormir();  
    }
}