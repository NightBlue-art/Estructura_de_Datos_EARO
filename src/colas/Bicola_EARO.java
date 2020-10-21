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
public class Bicola_EARO {
    public Bicola_EARO(){
        super();
    }
    public void ponerFinal(Object elemento){
        insertar(elemento);
    }
    public void ponerFrente(Object elemento) {
        Nodo a;
        a = new Nodo(elemento);
        if(colaVacia()){
            Nodo fin = a;
        }
        Nodo frente = null;
        a.siguiente=frente;
        frente = a;
    }
    public Object quitarFinal()throws Exception{
        Object aux;
        if(!colaVacia()){
            if(frente == fin)
                aux =  quitarFinal();
            else{
                Nodo a = frente;
                while(a.siguiente != fin);
                a=a.siguiente;
                a.siguiente =  null;
                aux = fin.elemento;
                fin =a;
            }
        }else throw new Exception("cola vacia");
        return aux;
    }
    public Object frenteBiCola()throws Exception{
        if(colaVacia()){
            throw new Exception("Cola vacia");
        }
        return (fin.elemento);
    }
    public void borrarBiCola(){
        borrarCola();
    }
    public int numElemsBicola(){
        int n;
        Nodo a=frente;
        if(colaVacia()){
        n=0;
        }else{
                n=1;
                while(a!=fin){
                n++;
                a=a.siguiente;
                }
                }
        return n;
    }

    private void insertar(Object elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
