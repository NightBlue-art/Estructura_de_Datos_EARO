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
public class ArbolBinario_EARO {
    protected Nodo raiz;
    public ArbolBinario_EARO(){
        raiz=null;
    }
    public ArbolBinario_EARO(Nodo raiz){
        this.raiz = raiz;
    }
    public Nodo raizArbol(){
        return raiz;
    }
    public boolean esVacio(){
        return raiz == null;
    }
    public static Nodo nuevoArbol(Nodo ramaIzqda,Object dato,Nodo ramaDrcha){
        return new Nodo(ramaIzqda,dato,ramaDrcha);
    }
    public void preorden(Nodo r){
        if (r != null){
            r.visitar();
            preorden(r.subarboIzdo());
            preorden(r.subarboDcho());
        }
    }
    public void postorden(Nodo r){
        if(r!=null){
            postorden(r.subarboIzdo());
            postorden(r.subarboDcho());
            r.visitar();
        }
    }
    public void inorden(Nodo r){
        if(r!=null){
            inorden(r.subarboIzdo());
            r.visitar();
            inorden(r.subarboDcho());
        }
    }
    public int altura(Nodo raiz){
        if(raiz == null)
            return 0;
        else{
            int alturaIz=altura(raiz.subarboIzdo());
            int alturaDr=altura(raiz.subarboDcho());
            if(alturaIz>alturaDr)
                return alturaIz + 1;
            else
                return alturaDr + 1;
        }
    }
    public boolean arbolLleno(Nodo raiz){
        if(raiz ==  null)
            return true;
        else
            if(altura(raiz.subarboIzdo())!= altura(raiz.subarboDcho()))
                return false;
        return arbolLleno(raiz.subarboIzdo()) && arbolLleno(raiz.subarboDcho());
    }
    public int numNodos(Nodo raiz){
        if(raiz ==null)
            return 0;
        else
            return 1+numNodos(raiz.subarboIzdo())+numNodos(raiz.subarboDcho());
    }
}
