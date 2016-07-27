/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SPPDF
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PilaCadenas<String> pc = new PilaCadenas();
        int opcion = 0;
        String cad = null;
        do {            
            try {
                System.out.println("1.- Agregar Cadena");
                System.out.println("2.- Quitar Cadena");
                System.out.println("3.- Mostrar Todas las Cadenas");
                System.out.println("4.- Salir");
                opcion = Integer.parseInt(br.readLine());
                switch(opcion){
                    case 1:
                        System.out.println("Ingrese una cadena");
                        cad = br.readLine();
                        pc.setCad(cad);
                        break;
                    case 2:
                        System.out.println("Cadena Eliminada");
                        pc.removeCadena();
                        break;
                    case 3:
                        pc.imprimirCadenas();
                        break;
                    default:
                        break;
                }
            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (opcion != 4);
                
                
    }
    
}
