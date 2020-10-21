/*+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.listaDoble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author Night
 */
public class ListaEnRango {
    public static void main(String[]ar)throws IOException{
        Random r;
        int d, x1,x2;
        final int M = 29;
        final int MX = 999;
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        ListaDoble_EARO listaDb;
        r =  new Random();
        listaDb=new ListaDoble_EARO();
        for (int j = 1; j <= M; j++) {
            d=r.nextInt(MX) + 1;
            listaDb.insertarCabezaLista(d);
        }
      System.out.println("Elementos de la lista original");
      listaDb.visualizarCabeza();
        System.out.println("\nRango que va a contener la lista");
        x1=Integer.parseInt(entrada.readLine());
        x2=Integer.parseInt(entrada.readLine());
        IteradorLista iterador = new IteradorLista(listaDb);
        Nodo a;
        a=iterador.siguiente();
        while(a != null){
            int w;
            w=a.dato;
            if(!(w >= x1 && w <= x2))
                listaDb.eliminar(w);
            a = iterador.siguiente();}
        System.out.println("Elementos actuales de la lista");
        listaDb.visualizarCabeza();
        }
    }
