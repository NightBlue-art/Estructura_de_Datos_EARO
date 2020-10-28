/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mOrdenacion;

import java.util.Arrays;

/**
 *
 * @author Night
 */
public class IntroduccionBasicos {
    public static void main(String[] args) {
        int []lista1={15,7,19,46,67,21,58,45,85,40,69,98,34,38,61,91,75,57,31,17};
        int []lista2={87,27,5,15,91,74,96,70,99,72,81,24,93,95,47,94,40,1,14,32};
        int []lista3={55,9,11,34,62,80,2,8,3,86,77,66,90,20,73,85,36,74,40,54};
        int []lista4={7,64,60,29,42,5,13,10,44,85,81,88,76,31,74,55,59,66,47};
        int []lista5={84,54,21,25,92,77,34,4,28,37,27,55,80,69,42,83,0,93,98,31};
        System.out.println("\tMetodos de ordenacion Burbuja");
        System.out.println("Lista desordenada");
        System.out.println(Arrays.toString(lista1));
        MetodosBasicoOrdenacion.ordBurbuja(lista1);
        System.out.println("ListaOrdena");
        System.out.println(Arrays.toString(lista1));
        
        System.out.println("\n\tMetodos de ordenacion Burbuja v2");
        System.out.println("Lista desordenada");
        System.out.println(Arrays.toString(lista2));
        MetodosBasicoOrdenacion.ordIntercambio(lista2);
        System.out.println("ListaOrdena");
        System.out.println(Arrays.toString(lista2));
       
        System.out.println("\n\tMetodos de ordenacion Intercambio");
        System.out.println("Lista desordenada");
        System.out.println(Arrays.toString(lista3));
        MetodosBasicoOrdenacion.ordIntercambio(lista3);
        System.out.println("ListaOrdena");
        System.out.println(Arrays.toString(lista3));
       
        System.out.println("\tMetodos de ordenacion Insercion");
        System.out.println("Lista desordenada");
        System.out.println(Arrays.toString(lista4));
        MetodosBasicoOrdenacion.ordIntercambio(lista4);
        System.out.println("ListaOrdena");
        System.out.println(Arrays.toString(lista4));
        
        System.out.println("\tMetodos de ordenacion Selecciom");
        System.out.println("Lista desordenada");
        System.out.println(Arrays.toString(lista5));
        MetodosBasicoOrdenacion.ordIntercambio(lista5);
        System.out.println("ListaOrdena");
        System.out.println(Arrays.toString(lista5));
    }
}
