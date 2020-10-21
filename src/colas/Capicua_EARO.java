/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import pilas.PilaEstatica_EARO;

/**
 *
 * @author Night
 */
public class Capicua_EARO {
    private static boolean valido(String numero){
        boolean sw = true;
        int i = 0;
        while(sw &&(i < numero.length())){
            char c;
            c = numero.charAt(i++);
            sw= (c>='0'&& c<='9');
        }
        return sw;
    }
    public static void main(String[] a) {
        boolean capicua;
        BufferedReader entrada =  new BufferedReader(new InputStreamReader(System.in));
        String numero;
        PilaEstatica_EARO pila= new PilaEstatica_EARO();
        ColaCircular_EARO q = new ColaCircular_EARO();
        try{
            capicua = false;
            while(!capicua){
                do{
                    System.out.println("\nTeclea el numero: ");
                    numero = entrada.readLine();
                }while(!valido(numero));
                for (int i = 0; 1<numero.length(); i++){
                    Character c;
                    c= Character.valueOf(numero.charAt(i++));
                    q.insertar(c);
                    pila.insertar(c);
                }
                do{
                    Character d;
                    d= (Character)q.quitar();
                    capicua = d.equals(pila.quitar());
                }while(capicua && !q.colaVacia());
                if(capicua)
                    System.out.println(numero+"es capicua.");
                else{
                    System.out.println(numero+"no es capicua,");
                    System.out.println("intente otro.");
                }
                q.borrarCola();
                pila.limpiarPila();
            }
        }
        catch(Exception er){
            System.out.println("Error (excepcion)en el proceso: "+er);
        }
    }
}
