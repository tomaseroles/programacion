/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12;

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
    
    void persona(){
        nombre = "Nombre";
        edad = 0;
        sexo = 'H';
        peso=0;
        altura=0;
    }
    
    void persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
    }
    
    void persona(String nombre, int edad, String dni, char sexo, double peso, int altura){
        this.nombre=nombre;
        this.edad = edad;
        this.DNI=dni;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
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
    
    public String generaDNI(){
        int ndni;
        char letra;
        
        ndni = (int)Math.random()*100000000;
        letra = letras.charAt(ndni/23);
        
        return Long.toString(ndni)+letra;
    }
    
    public boolean mayorEdad(){
        return (this.edad>=18);
    }
    
    @Override public String toString(){
        String salida;
        salida = "Ficha completa:";
        salida+= "Nombre:     " + getNombre();
        salida+= "Edad:       " + getEdad();
        salida+= "DNI:        " + getDNI();
        salida+= "Sexo:       " + getSexo();
        salida+= "Peso(kg):   " + getPeso();
        salida+= "Altura(cm): " + getAltura();
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
