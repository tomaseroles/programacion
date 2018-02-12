/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

/**
 *
 * @author tomfor
 */
public class CuentaClave extends practica6.cuenta{
    String clave;
    
    public CuentaClave(float sInicial, String iniClave){
        super(sInicial);
        clave = iniClave;
    }
    
    @Override public void Activar(){
        super.Activar();
    }
    @Override public void Extraer(float valor){
        if(valor>super.getSaldo())
            System.out.println("No tiene suficiente saldo.");
        else
            super.Extraer(valor);
    }
    
    @Override public void Ingresar(float cantidad){
        super.Ingresar(cantidad);
    }
}
