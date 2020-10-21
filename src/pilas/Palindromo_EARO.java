/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

/**
 *
 * @author Night
 */
public class Palindromo_EARO {
 public  static void main(String [] a){
     PilaLista_EARO pilaChar;
     boolean esPal;
     String pal;
     BufferedReader entrada =  new BufferedReader(new InputStreamReader(System.in));
     try{
         pilaChar =new PilaLista_EARO();
         System.out.println("Teclea la palabra a verificar si un palindromo: ");
         pal = entrada.readLine();
         for ( int i = 0; i < pal.length();){
             Character c;
             c= Character.valueOf(pal.charAt(i++));
             pilaChar.insertar(c);
         }
         esPal =  true;
         for (int j = 0; esPal && !pilaChar.pilaVacia();){
             Character c;
             c = (Character)pilaChar.quitar();
             esPal = pal.charAt(j++) == c.charValue();
         }
         pilaChar.limpiarPila();
         if(esPal)
             System.out.println("La palabra"+pal+"es un palindromo \n");
         else
             System.out.println("La palabra"+pal+"no es un palindromo \n");
     }
         catch (Exception er){
                 System.err.println("Expecion: "+er);
                 }
     }

    public Palindromo_EARO() {
    }
}