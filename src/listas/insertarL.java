/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.Scanner;

/**
 *
 * @author Night
 */
public class insertarL {
    public static void main(String[]args){
        int opcion;
        Scanner teclado=new Scanner(System.in);
        Lista_EARO lista=new Lista_EARO();
        System.out.println("Lista Simple Enlazada");
        System.out.println("1.Insertar Principio");
        System.out.println("2.Insertar Final");
        System.out.println("3.Mostrar");
        System.out.println("4.Insertar despues de");
        System.out.println("5.Eliminar Principio");
        System.out.println("6.Eliminar Final");
        System.out.println("7.Eliminar Especifico");
        do{
            opcion=teclado.nextInt();
            switch(opcion){
                case  1:
                   System.out.println("Escriba un dato:");
                    lista.insertarPrimero(Integer.parseInt(teclado.next()));
                    break;
                       case  2:
                   System.out.println("Escriba un dato:");
                    lista.insertarUltimo(Integer.parseInt(teclado.next()));
                    break;
                       case 3:
                   System.out.println("Elementos de la lista:");
                    lista.visualizar();
                    System.out.println("");
                    break;
                       case 4:
                   System.out.println("Escriba dato a buscar y dato a insertar:");
                    lista.insertarEntreLista(Integer.parseInt(teclado.next()),Integer.parseInt(teclado.next()));
                    break;
                       case 5:
                       lista.eliminarPrimero();
                       break;
                       case 6:
                           lista.eliminarUltimo();
                           break;
                       case 7:
                           lista.eliminar((Integer.parseInt(teclado.next())));
                           break;}
        }while(opcion!=8);
        teclado.close();
            }
}
