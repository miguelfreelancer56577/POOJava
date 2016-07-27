/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_3;

import java.util.ArrayList;

/**
 *
 * @author SPPDF
 */
public class PilaCadenas<E> {
    
    private ArrayList<E> cadenas;
    
    public PilaCadenas(){
        cadenas = new ArrayList<>();
    }

    private ArrayList<E> getCad() {
        return cadenas;
    }

    public void setCad(E cad) {
        if(!cadenas.contains(cad))
            cadenas.add(cad);
        
    }
    
    public void removeCadena(){
        int index = cadenas.size()-1;
        if(index >= 0)
            cadenas.remove(index);
    }
    
    public void imprimirCadenas(){
        System.out.println("Cadenas Contenidas");
        for (E cadena : cadenas) {
            System.err.println(cadena);
        }
    }
    
    
    
}
