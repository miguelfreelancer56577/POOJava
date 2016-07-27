/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author SPPDF
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Notas nt = new  Notas();
        int nota = 0;
        do {
            System.err.println("Introduca un numero.");
            nota = Integer.parseInt(br.readLine());
            nt.setNotas(nota);
        } while (nota >= 0);
        System.err.println("imprime las notas");
        nt.imprimirNotas();
        System.err.println("notas leidas");
        System.err.println(nt.notasLeidas());
        System.err.println("nota media");
        System.err.println(nt.notaMedia());
        System.err.println("nota alta");
        System.err.println(nt.notaAlta());
        System.err.println("nota baja");
        System.err.println(nt.notaBaja());
    }
    
}
