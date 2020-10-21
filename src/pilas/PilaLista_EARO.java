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
public class PilaLista_EARO {
    private Nodo cima;
    public PilaLista_EARO(){
        cima = null;
    }
    public boolean pilaVacia(){
        return cima==null;
    }
    public void insertar(Object elemento){
        Nodo nuevo;
        nuevo=new Nodo(elemento);
        nuevo.siguiente=cima;
        cima=nuevo;
    }
    public Object quitar() throws Exception{
        if(pilaVacia())throw new Exception("Pila vacia, no se puede extraer.");
        Object aux=cima.elemento;
        cima=cima.siguiente;
        return aux;
    }
    public Object cimaPila()throws Exception{
        if(pilaVacia())throw new Exception("Pila vacia, no se peude leer cima");
        return cima.elemento;
    }
    public void limpiarPila(){
        Nodo t;
        while(!pilaVacia()){
            t=cima;
            cima=cima.siguiente;
            t.siguiente=null;
        }
    }
    public static void main(String[] args)throws Exception{
        System.out.println("Pila Dinamica(lista enlazada)");
        PilaLista_EARO pilaL=new PilaLista_EARO();
        pilaL.insertar("elemento");
        try {
            System.out.println(pilaL.cimaPila());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(pilaL.quitar());
        } catch (Exception e) {
            System.out.println("Capturada de nuevo: "+e);
        }
        pilaL.limpiarPila();
    }
}
