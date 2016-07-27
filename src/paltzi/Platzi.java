/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paltzi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;
import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modificadoresAcceso.Prueba;
import tiposGenericos.Pila;

/**
 *
 * @author SPPDF
 */
public class Platzi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
//        modificadores de acceso
//        Prueba p = new Prueba("");
//        p.funB();
        
//        Character ct = new Character('e');
//        Long lg = new Long("45.6999");
//        lg.longValue();
//        Float ft = new Float("3455");
//        ft.longValue();
        
        
//        definicion de tipos genericos
//        pila de integers
//        Pila<Integer> enteros = new Pila<>();1
//        pila de strings 
//        Pila<String> cadenas = new Pila<>();
//        cadenas.setTipoDato("cadena 1");
//        cadenas.setTipoDato("cadena 2");
//        cadenas.setTipoDato("cadena 3");
//        System.out.println(cadenas.getTipoDato());
//        pila de double
//        Pila<Double> decimales = new Pila<>();
//        decimales.setTipoDato(2.56);
//        decimales.setTipoDato(258.90);
//        decimales.setTipoDato(9863.3);
//        System.out.println(decimales.getTipoDato());
//        coleciones de tipo genericas
//        List mls = new ArrayList();
//        System.out.println(mls.size());
//        Hashtable <Double,String> tGenerico = new Hashtable();
//        tGenerico.put(1., "tema 1");
//        tGenerico.put(1.1, "tema 1.1");
//        System.out.println(tGenerico);
        
//        ArrayList ls = new ArrayList();
//        ls.add("1.4");
//        ls.add("4.7");
//        ls.add("8.6");
//        ls.add("3.89");
//        ls.add("87.2");
//        ls.add(0,"0.56");
//        String s = "45";
//        System.out.println(ls);
//        ls.clear();
//        System.out.println(ls.indexOf("hello"));
//        for (Object msg : ls) {
//            Double cad = new Double((String)msg);
//            System.out.println(cad.intValue());
//        }
//        
//        Hashtable ht = new Hashtable();
//        
//        ht.put("a1", ls);
//        ht.put("a2", "row2");
//        ht.put("a3", "row3");
//        ht.put("a4", "row4");
//        
//        System.out.println(ht);
//        System.out.println(ht.containsKey("a1"));
//        ArrayList array = (ArrayList)ht.get("a1");
//        System.out.println(array.get(1));
//        Enumeration keys = ht.keys();
//        String clave, valor;
//        while (keys.hasMoreElements()) {            
//            clave = (String)keys.nextElement();
//            valor = (String)ht.get(keys.nextElement());
//            System.out.println("clave: "+clave);
//            System.out.println("valor: "+valor);
//        }
//        
//        String longitud = "longitud";
//        System.out.println(longitud.length());
        
//        expresiones regulares
//        Pattern pt = Pattern.compile("J2[SEM]E");
//        Matcher m = pt.matcher("J2SE");
//        if(m.matches())
//            System.out.println("existen coincidencias");
//        else
//            System.out.println("no existen coincidencias");
            
        
//        Scanner sc = new Scanner(new File("C:/Users/SPP/Documents/NetBeansProjects/ProgramadorCertificadoJava/src/datos.txt")).useDelimiter(",");
//        
//        System.out.println("Nombres desde un archivo fuente...");
//        
//        while (sc.hasNext()) {            
//            System.out.println(sc.next());
//        }
        
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        String name;
//        int num;
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("ingresa el nombre "+i);
//            sc.next();
//        }
        
        
        
//        double cuad = PI*PI;
//        System.out.printf("el cuadrado de %1$+1.4f es %2$.2f", PI, cuad);
//        System.out.println("");
//        Calendar cl  = Calendar.getInstance();
//        System.out.printf("%1$tH:%1$tM:%1$tS---%1$td de %1$tB de %1$ty", cl);
        
//        autoboxing
//        int a = 1;
//        Integer b = a;
//        System.out.println(b);
//        int c = b;
//        System.out.println(c);
        
//        String cd = "2.456";
//        Float numero = new Float(cd);
//        float back = numero.floatValue();
//        System.out.println(back);
        
//        String fecha = "";
//        Calendar cl = Calendar.getInstance();
//        fecha += cl.get(Calendar.DAY_OF_MONTH)+"/";
//        fecha += cl.get(Calendar.MONTH)+1+"/";
//        fecha += cl.get(Calendar.YEAR);
//        System.out.println(fecha);
        
        
//        Date ft = new Date();
//        System.out.println(ft.toString());
//        System.out.println(ft.getTime());
        
//        argumentos(34);
        
        // TODO code application logic here
//        byte  i = 1;
//        byte j = 1;
//        byte k = i+j;
        
//        int i =7;
//        char c= 'w';
//        System.err.println((i >= 6) && (c == 'w'));
//        
//        i=1; 
//        int j=2;
//        int k=3; 
//        int m=2; 
//        System.out.println ((j >= i) || (k == m));
        
//        int x = 1;  
//        System.out.println(x);
//        int cont = 1;
//        while (x <= 10){
//            System.out.println(++x);
//            System.out.println("numero de iteraciones "+cont);
//            cont++;
//        }
//        int i=1; 
//        int j=2;
//        int k=3; 
//        int m=2; 
//        System.out.println ((j >= i) || (k == m));
    }
    public static void argumentos (int uno){
        System.out.println("solo uno");
    }
    
    public static void argumentos (int ... varios){
        System.out.println("varios");
    }
    
}
