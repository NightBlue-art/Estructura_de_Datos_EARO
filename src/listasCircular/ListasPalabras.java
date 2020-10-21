/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasCircular;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Night
 */
public class ListasPalabras {
    public static void main(String[] args) throws IOException {
        String palabra;
        ListaCircular_EARO listaCP;
        int opc;
        BufferedReader entrada =  new BufferedReader(new InputStreamReader(System.in));
        listaCP = new ListaCircular_EARO();
        System.out.println("\n Entrada de Nombres. Termina con ^Z.\n");
        while((palabra =  entrada.readLine())!=null){
            String nueva;
            nueva=new String(palabra);
            listaCP.insertar(nueva);
        }
        System.out.println("\t\tLista circular de palabras");
        listaCP.visualizar();
        System.out.println("\n\t Opciones para manejar la lista");
        do{
            System.out.println("1.Eliminar una palabra.\n");
            System.out.println("2.Mostrar la lista completa.\n");
            System.out.println("3.Salir y eliminar la lista\n");
            do{
                opc=Integer.parseInt(entrada.readLine());
            }while(opc<1 || opc>3);
            switch(opc){
                case 1:
                    System.out.print("Palabra a eliminar: ");
                    palabra=entrada.readLine();
                    listaCP.eliminar(palabra);
                    break;
                    case 2:
                        System.out.println("Palabras de la Lista: \n");
                        listaCP.visualizar();
                        break;
                        case 3:
                            System.out.print("Eliminar de la lista. ");
                            listaCP.borrarLista();
            }
        }while(opc != 3);
    }
}
