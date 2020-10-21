/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolBinario;

/**
 *
 * @author Night
 */
public class InsertarArbolB {
   public static void main(String[] args)throws Exception{
        ArbolBinario_EARO arbol;
        Nodo a1,a2,a = null;
        PilaLista_EARO pila = new PilaLista_EARO();
        
        a1=ArbolBinario_EARO.nuevoArbol(null,"Maria",null);
        a2=ArbolBinario_EARO.nuevoArbol(null,"Rodrigo",null);
        pila.insertar(a);
        
        a1=ArbolBinario_EARO.nuevoArbol(null,"Carlos",null);
        a2=ArbolBinario_EARO.nuevoArbol(a1,"Jesus",a2);
        pila.insertar(a);
        
        a2 = (Nodo)pila.quitar();
        a1 = (Nodo)pila.quitar();
        a=ArbolBinario_EARO.nuevoArbol(a1,"Guadalupe",a2);
        arbol = new ArbolBinario_EARO(a);
        System.out.println("Preorden -");
        arbol.preorden(arbol.raizArbol());
        System.out.println("\nInorden -");
        arbol.inorden(arbol.raizArbol());
        System.out.println("\nPostorden");
        arbol.postorden(arbol.raizArbol());
        System.out.println("\nNumero de nodos del arbol binario"+arbol.numNodos(arbol.raizArbol()));
        System.out.println("Altura del arbol binario"+arbol.altura(arbol.raizArbol()));
        System.out.println("Arbol binario completo"+arbol.arbolLleno(arbol.raizArbol()));
    }  
}
