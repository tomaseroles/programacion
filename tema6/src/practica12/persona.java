/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12;

import java.util.Random;

/**
 *
 * @author tomfor
 */
public class persona {
    String nombre;
    int edad;
    String DNI;
    char sexo;
    double peso;
    int altura;
    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    public persona(){
        nombre = "Nombre";
        edad = 0;
        sexo = 'H';
        peso=90;
        altura=175;
        generaDNI();
    }
    
    persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso = 90;
        this.altura = 175;
        generaDNI();
    }
    
    persona(String nombre, int edad, char sexo, double peso, int altura){
        this.nombre=nombre;
        this.edad = edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
        generaDNI();
    }
    
	public double calcularIMC(){
        double imc;
        imc = getPeso()/getAltura()*getAltura();
        if(imc<20)
            return -1;
        else if(imc>=20 && imc<=25)
            return 0;
        else
            return 1;
    }
    
    public void generaDNI(){
        Random rnd = new Random();
        int ale = rnd.nextInt(99999999-00000000);
        DNI=Integer.toString(ale)+letras.charAt(ale%23);
    }
    
    public boolean mayorEdad(){
        return (this.edad>=18);
    }
    
    @Override public String toString(){
        String salida;
        salida = "Ficha completa:\n";
        salida+= "Nombre:     " + getNombre() + "\n";
        salida+= "Edad:       " + getEdad() + "\n";
        salida+= "DNI:        " + getDNI() + "\n";
        salida+= "Sexo:       " + getSexo() + "\n";
        salida+= "Peso(kg):   " + getPeso() + "\n";
        salida+= "Altura(cm): " + getAltura() + "\n";
        salida+= "IMC:        " + calcularIMC();
        return salida;
    }
    
    public String getNombre(){ return this.nombre; }
    
    public void setNombre(String n){ this.nombre = n; }
    
    public int getEdad(){ return this.edad; }
    
    public void setEdad(int e){ this.edad=e; }
    
    public String getDNI(){ return DNI; }
        
    public char getSexo(){ return sexo; }
    
    public void setSexo(char s){ this.sexo = s; }
    
    public double getPeso(){ return peso; }
    
    public void setPeso(double p){ this.peso=p; }
    
    public int getAltura(){ return altura; }
    
    public void setAltura(int a){ this.altura=a; }
            
}
