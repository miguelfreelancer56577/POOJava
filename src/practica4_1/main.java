/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_1;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        Hashtable personas;
        Agenda ag = new Agenda();
        Persona p;
        int op;
        String dni;
        String nombre;
        Long telefono;
        try {
            do {                
                System.out.println("Ingrese el numero de la opcion que desea");
                System.out.println("1.- Agregar Persona");
                System.out.println("2.- Buscar Persona");
                System.out.println("3.- Eliminar Persona");
                System.out.println("4.- Mostrar todas las Personas");
                System.out.println("5.- Salir");
                op = sc.nextInt();
                switch(op){
                    case 1:
                        System.out.println("Ingrese el Dni");
                        dni = sc.next();
                        System.out.println("Ingrese el Nombre");
                        nombre = sc.next();
                        System.out.println("Ingrese el Telefono");
                        telefono = sc.nextLong();
                        if(ag.setPersonas(dni, new Persona(dni, nombre, telefono))){
                            System.out.println("La persona se agrego con exito.");
                        }else{
                            System.out.println("La persona ya existe.");
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el Dni de la persona.");
                        dni = sc.next();
                        p = ag.buscar(dni);
                        if(p == null){
                            System.out.println("La Persona no existe.");
                        }else{
                            System.out.println(p.toString());
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese el Dni de la persona que desea remover.");
                        dni = sc.next();
                        p = ag.eliminar(dni);
                        if(p != null){
                            System.out.println("El siguiente registro se elimino con exito."+p.toString());
                        }else{
                            System.out.println("No se pudo eliminar a la persona.");
                        }
                        break;
                    case 4: 
                        personas = ag.getPersonas();
                        if(personas.size() == 0){
                            System.out.println("No existe ninguna persona.");
                            break;
                        }
                        Enumeration clave = personas.keys();
                        while (clave.hasMoreElements()) {                            
                            System.out.println(personas.get(clave.nextElement()));
                        }
                        break;
                }
            } while (op != 5);
            System.out.println("fin del programa....");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
