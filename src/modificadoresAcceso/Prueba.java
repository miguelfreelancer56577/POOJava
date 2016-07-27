/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadoresAcceso;

/**
 *
 * @author SPPDF
 */
public class Prueba {
    
   String dato;

    protected Prueba(String dato) {
        this.dato = dato;
    }
    
    void funA(){
        System.out.println("funcion a");
    }
    public void funB(){
        System.out.println("funcion b");
    }
    private void funC(){
        System.out.println("funcion c");
    }
    protected void funD(){
        System.out.println("funcion d");
    }
}
