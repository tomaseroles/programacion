/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exClases;

/**
 *
 * @author tomfor
 */
public class profeAsociado extends profesor {
    private int horasTrabajo;
    
    profeAsociado(){
        
    }
    
    profeAsociado(String nombre, String apellidos, int dni, int hTrabajo){
        super.setNombre(nombre);
        super.setApellidos(apellidos);
        super.setDNI(dni);
        this.horasTrabajo=hTrabajo;
    }

    public static void toString(profeAsociado[] pa,int maximo){
        for(int i=0;i<maximo;i++){
            System.out.println(pa[i].infoAsociado());
        }
    }
    
    public String infoAsociado(){
        return "\tNombre: " + super.getNombre() + "\n\tApellidos: " + super.getApellidos() + "\n\tDNI: " + super.getDNI() + "\n\tHoras: " + this.horasTrabajo;
    }
}
