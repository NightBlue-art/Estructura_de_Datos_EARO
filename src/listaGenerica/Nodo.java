/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaGenerica;

/**
 *
 * @author Night
 */
public class Nodo {
    Object dato;
    Nodo enlace;
    public Nodo(Object x,Nodo n){
        dato = x;
        enlace=n;
    }

    Nodo(Object entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Object leerDato(){
        return dato;
    }
    public Nodo siguiente(){
        return enlace;
    }
}
