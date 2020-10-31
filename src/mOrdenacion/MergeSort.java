/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mOrdenacion;
import listas.*;

/**
 *
 * @author Night
 */
public class MergeSort {
    static Nodo mergesort(Nodo h){
        if(h == null || h.enlace == null){
            return h;
        }
        Nodo mitad = mitad(h);
        Nodo sgtmitad = mitad.enlace;
        mitad.enlace =  null;
        Nodo izq = mergesort(h);
        Nodo derc =mergesort(sgtmitad);
        Nodo sortedlist = mezcla(izq, derc);
        return sortedlist;
    }
    static Nodo mezcla(Nodo primero, Nodo ultimo){
        Nodo resultado = null;
        if(primero == null)
            return ultimo;
        if(ultimo == null)
            return primero;
        if(primero.dato<= ultimo.dato){
            resultado = primero;
            resultado.enlace = mezcla(primero.enlace,ultimo);
        }
        else{
            resultado = ultimo;
            resultado.enlace = mezcla(primero, ultimo.enlace);
        }
        return resultado;
    }
    static  Nodo mitad(Nodo h){
        if(h == null)
            return h;
        Nodo rapido = h.enlace;
        Nodo lento= h;
        while(rapido != null){
            rapido = rapido.enlace;
            if(rapido !=  null){
                lento = lento.enlace;
                rapido =  rapido.enlace;
            }
        }
        return lento;
    }
    public static void main(String[] args){
        Lista_EARO list=new Lista_EARO();
        int SUP =9999;
        for (int i = 0; i < 1000; i++) 
            list.insertarPrimero((int)(Math.random()* SUP +1));
            System.out.println("\n\t Lista enlazada desordenada: ");
            list.imprimirLista();
            list.primero = MergeSort.mergesort(list.primero);
            System.out.println("\n\tLista enlazada ordenada: ");
            list.imprimirLista();
        }
    }
    

