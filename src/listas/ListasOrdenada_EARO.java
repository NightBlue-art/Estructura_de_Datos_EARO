/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Night
 */
public class ListasOrdenada_EARO extends  Lista_EARO{
    public ListasOrdenada_EARO(){
        super();
    }
    public ListasOrdenada_EARO insertaOrden(int entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        if(primero== null)
            primero = nuevo;
        else if(entrada < primero.getDato()){
            nuevo.setEnlace(primero);
            primero = nuevo;
        }else{
            Nodo anterior,p;
            anterior = p = primero;
            while((p.getEnlace()!=null)&&(entrada > p.getDato())){
                anterior = p;
                p=p.getEnlace();
            }
            if (entrada > p.getDato())
                anterior = p;
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }
        return this;
    }
}
