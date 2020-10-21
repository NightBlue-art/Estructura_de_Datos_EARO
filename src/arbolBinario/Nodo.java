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
public class Nodo {
    protected Object dato;
    protected Nodo izdo;
    protected Nodo dcho;
    Nodo siguiente;
    Object elemento;
    public Nodo(Object valor){
        dato=valor;
        izdo=dcho=null;
    }
    public Nodo(Nodo ramaIzdo,Object valor, Nodo ramaDcho){
        dato=valor;
        izdo=ramaIzdo;
        dcho=ramaDcho;
    }
    public void visitar(){System.out.println(dato + " ");}
    public Object valorNodo(){return dato;}
    public Nodo subarboIzdo(){return izdo;}
    public Nodo subarboDcho(){return dcho;}
    public void nuevoValor(Object d){dato = d;}
    public void ramaIzdo(Nodo n){izdo = n;}
    public void ramaDcho(Nodo n){dato = n;}
}
