/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposGenericos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SPPDF
 */
public class Pila<E> {
    
    List<E> tipoDato;

    public Pila() {
        this.tipoDato  = new ArrayList<E>();
    }

    public List<E> getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(E dato) {
         this.tipoDato.add(dato);
//        this.tipoDato = tipoDato;
    }
    
}
