/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author tomfor
 */
public class cCoche {
    private String color;
    private String marca;
    private String tipo;
    private int marcha;
    
    public cCoche(){
        
    }
    
    public cCoche(String Color, String Marca, String Tipo, int Marcha){
        color=Color;
        marca=Marca;
        tipo=Tipo;
        marcha=Marcha;
    }
    
    public void setColor(String Color) { color = Color;}
    public void setMarca(String Marca) { marca = Marca;}
    public void setTipo(String Tipo) { tipo=Tipo;}
    
    public String getColor() { return color;}
    public String getMarca() { return marca;}
    public String getTipo () { return tipo; }
    
    public void Arrancar(){
        System.out.println("Arrancado");
    }
    
    public void Acelerar(){
        System.out.println("Acelerando");
    }
    
    public int SubirMarcha(){
        return marcha++;
    }
    
    public int Bajarmarcha(){
        return marcha--;
    }
    
    public void Frenar(){
        System.out.println("Frenando");        
    }
    
    public void Describir(){
        System.out.println("Coche: " + marca + " " + tipo + " " + color + ". Marcha: " + marcha);
    }
    
    
}
