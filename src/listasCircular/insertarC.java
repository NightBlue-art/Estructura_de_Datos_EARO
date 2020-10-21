/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasCircular;

import java.util.Scanner;

/**
 *
 * @author Night
 */
public class insertarC {
    public static void main(String[]args){
        ListaCircular_EARO listaC=new ListaCircular_EARO();
        int opcion;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Lista Enlazada circular");
        System.out.println("2.Insertar");
        System.out.println("3.Mostrar");
        System.out.println("5.Eliminar Primero");
        System.out.println("6.Eliminar Lista");
        System.out.println("7.Eliminar Especifico");
        do{
            System.out.println("Elige una opcion");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Escriba un dato: ");
                    listaC.insertar(String.valueOf(teclado.next()));
                    break;
                case 2:
                    System.out.print("Elementos de la lista: ");
                    listaC.visualizar();
                    System.out.println();
                    break;
                case 3:
                    listaC.eliminarLc();
                    break;
                case 4:
                    listaC.eliminar(String.valueOf(teclado.next()));
                    break;
                case 5:
                    listaC.borrarLista();
                    break;
            }
        }while(opcion!=6);
        teclado.close();
    }
}
