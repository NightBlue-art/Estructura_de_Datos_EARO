/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.Random;

/**
 *
 * @author Night
 */
public class ListaEnOrden {
    public static void main(String[]args){
        Random r;
        int d;
        ListasOrdenada_EARO lista;
        int k;
        r= new Random();
        lista = new ListasOrdenada_EARO();
        k=r.nextInt(99)+1;
        for(; k>= 0; k--){
            d=r.nextInt();
            lista.insertaOrden(d);
        }
        System.out.println("Elementos de la lista ordenada \n");
        lista.visualizar();
    }
}
