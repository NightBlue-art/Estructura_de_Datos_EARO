/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author Night
 */
public class ColaCircular_EARO {
    private static final int Size = 10;
    protected int frente;
    protected int fin;
    protected Object [] CircularCola;
    public ColaCircular_EARO(){
        frente = 0;
        fin = Size -1;
        CircularCola = new Object[Size];
    }
    private int siguiente(int r){
        return (r+1)%Size;
    }
    public boolean colaVacia(){
        return frente == siguiente(fin);
    }
    public boolean colaLlena(){
        return frente == siguiente(siguiente(fin));
    }
    public void insertar(Object elemento)throws Exception{
        if(!colaLlena()){
            fin = siguiente(fin);
            CircularCola[fin]=elemento;
        }else throw new Exception("Overflow en la cola");
    }
    public Object quitar()throws Exception{
        if(!colaVacia()){
            Object aux= CircularCola[frente];
            frente =siguiente(frente);
            return aux;
        }else throw new Exception("Cola vacia");
    }
    public Object frenteCola()throws Exception{
        if(!colaVacia()){
            return CircularCola[frente];
        }else throw new Exception("Cola vacia");
    }
    public void borrarCola(){
        frente = 0;
        fin = Size-1;
    }
    public static void main(final String[]args)throws Exception{
        ColaCircular_EARO colaC=new ColaCircular_EARO();
        System.out.println("Cola circular");
        try {
            colaC.insertar("Elemento");
        } catch (Exception e) {
        System.out.println(e);
    }
         try {
            System.out.println(colaC.quitar());
        } catch (Exception e) {
        System.out.println(e);
        }
         try {
            System.out.println(colaC.frenteCola());
        } catch (Exception e) {
            System.out.println(e);
        }
         colaC.borrarCola();
        }}
