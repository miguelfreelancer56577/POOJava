/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_2;

import java.util.ArrayList;
import static java.lang.Math.*;

/**
 *
 * @author SPPDF
 */
public class Notas {
    private ArrayList<Integer> notas;

    public Notas() {
        notas = new ArrayList<>();
    }

    private ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(int nota) {
        if(nota >= 0){
            notas.add(nota);
        }
    }
    
    public void imprimirNotas(){
        for (Integer nota : notas) {
            System.err.println(nota);
        }
    }

    public int notasLeidas(){
        return notas.size();
    }
    
    public int notaMedia(){
        int notaMedia = 0;
        for (Integer nota : notas) {
            notaMedia+=nota;
        }
        return notaMedia/notas.size();
    }
    
    public int notaBaja(){
        int notaBaja = notas.get(0);
        for (Integer nota : notas) {
            notaBaja = min(notaBaja, nota);
        }
        return notaBaja;
    }
    
    public int notaAlta(){
        int notaAlta = notas.get(0);
        for (Integer nota : notas) {
            notaAlta = max(notaAlta, nota);
        }
        return notaAlta;
    }
    
}
