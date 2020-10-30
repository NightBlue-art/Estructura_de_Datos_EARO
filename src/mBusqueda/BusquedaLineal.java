/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mBusqueda;

/**
 *
 * @author Night
 */
public class BusquedaLineal {
    public static int busquedaLineal(int array[], int x){
        int n=array.length;
        for (int i = 0; i < n; i++) {
            if(array[i]==x)
                return i;
        }
        return -1;
    }
    public static void main(String args[]){
        int [] lista={2,3,12,49,71,95,104,114,124,135,155,156,165,181,183,198,214,224,259,283,315,351,358,415,417,436,507,573,592,600,630,641,684,694,697,803,821,321,846,870,880,881,910,919,933,936,943,945,985,1000};
        int buscar=600;
        int resultado = busquedaLineal(lista, buscar);
        if(resultado == -1)
            System.out.println("Elemento no encontrado");
        else
            System.out.println("Elemento"+buscar+"encontrado en el indice: "+resultado);
    }
}
