/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exClases;

import java.util.Scanner;

/**
 *
 * @author tomfor
 */
public class lanzador {
    Scanner sc = new Scanner(System.in);
    public static int max=10;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opcion;
        int[] ultimos = new int[4];
        for(int i=0;i<4;i++)
            ultimos[i]=0;
        
        int dniPunto7, i7;
        
        String b;
        
        alumno[] al = new alumno[max];
        alumno alAux = new alumno();
        String auxNombre,auxApellidos,auxDireccion;
        int auxDNI=0;
        int auxCreditos=0;
        int auxHoras=0;
        profesor[] pr = new profesor[max];
        profeAsociado[] pa = new profeAsociado[max];
        asignatura[] as = new asignatura[max];
        int opt2;
        
        opcion = menu(ultimos);
        while (opcion!=8){
            switch (opcion){
                case 1:         //alta de alumno
                    System.out.println("Alta de un nuevo alumno:");
                    System.out.print("Nombre: ");
                    auxNombre=sc.nextLine();
                    System.out.print("Apellidos: ");
                    auxApellidos=sc.nextLine();
                    System.out.print("Telefono: ");
                    auxDNI=sc.nextInt();
                    System.out.print("Direccion: ");
                    auxDireccion=sc.nextLine();
                    auxDireccion=sc.nextLine();
                    al[ultimos[0]] = new alumno(auxNombre,auxApellidos,auxDNI,auxDireccion);
                    
                    ultimos[0]++;
                    break;
                case 2:         //alta de profesor
                    System.out.println("Alta de un nuevo profesor:");
                    System.out.print("Nombre: ");
                    auxNombre=sc.nextLine();
                    System.out.print("Apellidos: ");
                    auxApellidos=sc.nextLine();
                    System.out.print("DNI: ");
                    auxDNI=sc.nextInt();
                    pr[ultimos[1]] = new profesor(auxNombre,auxApellidos,auxDNI);
                    ultimos[1]++;
                    break;
                case 3:         //alta de asignatura
                    System.out.println("Alta de asignatura:");
                    System.out.print("Nombre: ");
                    auxNombre=sc.nextLine();
                    auxNombre=sc.nextLine();
                    System.out.print("Creditos: ");
                    auxCreditos=sc.nextInt();
                    System.out.print("DNI profesor: ");
                    auxDNI=sc.nextInt();
                    as[ultimos[2]] = new asignatura(auxNombre, auxCreditos, auxDNI);
                    ultimos[2]++;
                    break;
                case 4:         //alta de asociado
                    //nombre,apellidos,dni,horas
                    System.out.println("Alta de asociado");
                    System.out.print("Nombre: ");
                    auxNombre=sc.nextLine();
                    auxNombre=sc.nextLine();
                    System.out.print("Apellidos: ");
                    auxApellidos=sc.nextLine();
                    System.out.print("DNI: ");
                    auxDNI=sc.nextInt();
                    System.out.print("Horas: ");
                    auxHoras = sc.nextInt();
                    pa[ultimos[3]] = new profeAsociado(auxNombre, auxApellidos, auxDNI, auxHoras);
                    ultimos[3]++;
                    break;
                case 5:         //ver objetos creados
                    if(ultimos[0]>0){
                        System.out.println("\nLista de alumnos:");
                        alumno.toString(al, ultimos[0]);
                    }
                    if(ultimos[1]>0) {
                        System.out.println("\nLista de profesores:");
                        profesor.toString(pr, ultimos[1]);
                    }
                    if(ultimos[2]>0) {
                        System.out.println("\nLista de profesores asociados:");
                        profeAsociado.toString(pa, ultimos[3]);
                    }
                    if(ultimos[2]>0) {
                        System.out.println("\nLista de asignaturas:");
                        asignatura.toString(as,ultimos[2]);
                    }
                    System.out.println();
                    break;
                case 6:         //listar objetos creados
                    System.out.print("¿Que quieres ver? (1:alumnos, 2:profe, 3:asignatura, 4:asociado): ");
                    opt2 = sc.nextInt();
                    if(opt2==1)
                        System.out.println(al[0].mostrarInfoAlumno());
                    if(opt2==2)
                        System.out.println(pr[0].mostrarInfoProfesor());
                    if(opt2==3)
                        System.out.println(as[0].infoAsignatura());
                    if(opt2==4)
                        System.out.println(pa[0].infoAsociado());
                    break;
                case 7:         //asignaturas de un profesor
                    System.out.println("Introduce el DNI del profesor: ");
                    dniPunto7 = sc.nextInt();
                    for(i7=0;i7<ultimos[3];i7++){
                        if(as[i7].getDniProfe()==dniPunto7)
                            System.out.println(as[i7].infoAsignatura());
                        else
                            System.out.println("No encontrado");
                    }
                    
                    break;
            }
            opcion=menu(ultimos);
        }
    }
    
    public static int menu(int[] v){
        Scanner sc = new Scanner(System.in);
        int op=0;
        System.out.println("Menu de opciones");
        System.out.println("1. Alta de alumno              (Hay " + v[0] + ")");
        System.out.println("2. Alta de profesor            (Hay " + v[1] + ")");
        System.out.println("3. Alta de asignatura          (Hay " + v[2] + ")");
        System.out.println("4. Alta de asociado            (Hay " + v[3] + ")");
        System.out.println("5. Ver los objetos creados     (Hay " + (v[0]+v[1]+v[2]+v[3]) + ")");
        System.out.println("6. Listar objetos creados      (Hay " + (v[0]+v[1]+v[2]+v[3]) + ")");
        System.out.println("7. Asignaturas de un profesor");
        System.out.println("8. Salir del programa");
        System.out.print("\nOpcion: ");
        op = sc.nextInt();
        return op;
    }
}
