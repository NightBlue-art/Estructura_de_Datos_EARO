/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author Night
 */
public class PilaEstatica_EARO {
    private static final int Size = 15;
    private int cima;
    private final Object[]pila;
    public PilaEstatica_EARO(){
        cima = -1;
        pila = new Object[Size];
    }
    public boolean pilaVacia(){
        return cima == -1;
    }
    public boolean pilaLlena(){
        return cima == Size - 1;
    }
    public void limpiarPila(){
        cima = -1;
    }
    public void insertar(final Object elemento)throws Exception{
        if(pilaLlena()){
            throw new Exception("Desbordamiento pila");
        }cima++;
        pila[cima]=elemento;
    }
    public Object quitar()throws Exception{
        Object aux;
        if(pilaVacia()){
            throw new Exception("Pila vicia, no se puede extraer.");
        }aux =pila[cima];
        cima--;
        return aux;
    }
    public Object cimaPila()throws Exception{
        if(pilaVacia()){
            throw new Exception("Pila vacia, no se puede extraer.");
        }
        return pila[cima];
    }
    public static void main(final String[] args)throws Exception{
        PilaEstatica_EARO pila=new PilaEstatica_EARO();
        System.out.println("Pila estatica");
        try {
            pila.insertar("elemento");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(pila.cimaPila());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(pila.quitar());
        } catch (Exception e) {
            System.out.println(e);
        }
        pila.limpiarPila();
    }
}
