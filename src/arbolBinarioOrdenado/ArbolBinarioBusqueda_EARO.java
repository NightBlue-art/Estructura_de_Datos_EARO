/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolBinarioOrdenado;
import arbolBinario.*;
import arbolBinarioOrdenado.Nodo.Comparador;
/**
 *
 * @author Night
 */
public class ArbolBinarioBusqueda_EARO extends ArbolBinario_EARO{
    public ArbolBinarioBusqueda_EARO(){
        super();
    }
    public Nodo buscar(Object buscado){
        Comparador dato;
        dato = (Comparador)buscado;
        if(raiz==null)
            return null;
        else
            return localizar(raizArbol(), dato);
    }
    protected Nodo localizar(Nodo raizSub,Comparador buscado){
        if(raizSub ==null)
            return null;
        else if(buscado.igualQue(raizSub.valorNodo()))
            return raiz;
        else if(buscado.menorQue(raizSub.valorNodo()))
            return localizar(raizSub.subardoIzdo(),buscado);
        else
            return localizar(raizSub.subardoDcho(),buscado);
    }
    public void insertar(Object valor)throws Exception{
        Comparador dato;
        dato = (Comparador)valor;
        raiz = insertar(raiz,dato);
    }
    protected Nodo insertar(Nodo raizSub,Comparador dato)throws Exception{
        if(raizSub==null)
            raiz=new Nodo(dato);
        else if(dato.menorQue(raizSub.valorNodo())){
            Nodo iz;
            iz=insertar(raizSub.subardoIzdo(),dato);
            raizSub.ramaIzdo(iz);}
        else if (dato.mayorQue(raizSub.valorNodo())){
            Nodo dr;
            dr = insertar(raizSub.subardoDcho(),dato);
            raizSub.ramaDcho(dr);}
        else throw new Exception("Nodo duplicado");
        return raizSub;
        }
    public void eliminar(Object valor)throws Exception{
        Comparador dato;
        dato = (Comparador)valor;
        raiz = eliminar(raiz,dato);}
    protected Nodo eliminar(Nodo raizSub,Comparador dato)throws  Exception{
        if(raizSub==null)
            throw new Exception("No encontro el nodo con la clave");
        else if(dato.menorQue(raizSub.valorNodo())){
            Nodo iz;
            iz = eliminar(raizSub.su)
        }
    }
}
