/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.listaDoble;

/**
 *
 * @author Night
 */
public class ListaDoble_EARO {

    private static int entrada;
    private static int testigo;
    Nodo cabeza,fin;
    public ListaDoble_EARO(){
        cabeza=fin=null;
    }
    public ListaDoble_EARO insertarCabezaLista(int entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.adelante=cabeza;
        if (cabeza != null)
            cabeza.atras = nuevo;
        else
            fin=nuevo;
        cabeza=nuevo;
        return this;
    }
    public void visualizarCabeza(){
        Nodo aux;
        aux =  cabeza;
        while (aux != null){
            System.out.println(aux.dato + " ");
            aux=aux.adelante;
        }
        System.out.println(" ");
    }
    public void visualizarFin(){
        Nodo aux;
        aux=fin;
        while(aux !=null){
            System.out.println(aux.dato + " ");
            aux=aux.atras;}
        System.out.println(" ");
        }
    public ListaDoble_EARO insertarFinLista(int entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.atras=fin;
        if(fin !=null)
            fin.adelante=nuevo;
        fin=nuevo;
        return this;
    }
    public void eliminarCabeza(){
        Nodo actual;
        actual=cabeza;
        if(actual != null){
            if(cabeza==fin)
                fin=cabeza=null;
            cabeza=actual.adelante;
            if(actual.adelante != null)
                actual.adelante.atras=null;
            actual =  null;
        }else System.out.println("Lista vacia");
        }
    public void eliminarFinal(){
        Nodo actual;
        actual=fin;
        if(actual !=null){
            if(cabeza==fin)
                cabeza=fin=null;
            if(actual.atras !=null){
                fin=actual.atras;
                actual.atras.adelante=null;
            }
        }else System.out.println("Lista vacia");
    }
    public ListaDoble_EARO insertarDespues(int testigo,int entrada){
        Nodo nuevo, anterior;
        nuevo = new Nodo(entrada);
        anterior=buscarLista(testigo);
        nuevo.adelante=anterior.adelante;
        if(anterior.adelante != null)
            anterior.adelante.atras = nuevo;
        nuevo.atras=anterior;
        return this;
    }
    public Nodo buscarLista(int destino){
        Nodo indice;
        for(indice=cabeza;indice!=null;indice=indice.adelante)
            if(destino == indice.dato)
                return indice;
        return null;
    }
    public ListaDoble_EARO insertarAntes(int testigo,int entrada){
        Nodo nuevo, siguiente;
        nuevo=new Nodo(entrada);
        siguiente=buscarLista(testigo);
        nuevo.atras = siguiente.atras;
        if(siguiente.atras != null)
            siguiente.atras.adelante=nuevo;
        else cabeza=nuevo;
        nuevo.adelante=siguiente;
        return this;
    }
    public void eliminar(int entrada){
        Nodo actual;
        boolean encontrado =  false;
        actual=cabeza;
        while ((actual != null)&&(!encontrado)){
        if(!encontrado)
            actual=actual.adelante;
    }
        if(actual!=null){
            if(actual == cabeza){
                cabeza=actual.adelante;
                if(actual.adelante != null)
                    actual.adelante.atras =  null;
            }else if(actual.adelante != null){
                actual.atras.adelante=actual.adelante;
                actual.adelante.atras=actual.atras;
            }else{
                fin=actual.atras;
                actual.atras.adelante=null;}
            actual =  null;
            }
        }
    public static void main(String[]args){
        ListaDoble_EARO listaD=new ListaDoble_EARO();
        System.out.println("Lista Doblemente Enlazada");
        listaD.insertarCabezaLista(entrada);
        listaD.insertarFinLista(entrada);
        listaD.visualizarCabeza();
        listaD.visualizarFin();
        listaD.insertarDespues(testigo,entrada);
        listaD.insertarAntes(testigo,entrada);
        listaD.eliminarCabeza();
        listaD.eliminarFinal();
        listaD.eliminar(entrada);
    }

    void visualizarDespues(int parseInt, int parseInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void visualiarFin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
