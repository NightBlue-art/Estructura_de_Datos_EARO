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
public class Lista_EARO {
 public  Nodo primero;
   public void imprimirLista(){
       Nodo n;
       n = primero;
       while(n != null){
           System.out.println(n.dato +" ");
           n = n.enlace;
       }
   }
     public Lista_EARO(){
         primero = null;
     }
      public Lista_EARO insertarPrimero(int entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.setEnlace(primero);
        primero = nuevo;
        return this;
    }
    public void visualizar(){
        if(primero==null){
            System.out.println("Lista vacia");
        }else{
            Nodo n;
            int k = 0;
            n= primero;
            while(n != null){
                System.out.print(n.getDato()+"");
                n=n.getEnlace();
                k++;
                System.out.print((k%15 !=0 ? "": "\n"));
            }
        }
    }
    public Lista_EARO insertarUltimo(int entrada){
        Nodo nuevo,ultimo;
        nuevo=new Nodo(entrada);
        if(primero==null){
        primero=nuevo;
        }else{
            ultimo=primero;
            while(ultimo.getEnlace() !=null){
                ultimo = ultimo.getEnlace();
            }
            ultimo.setEnlace(nuevo);
        }
        return this;
    }
    public Lista_EARO insertarEntreLista(int testigo,int entrada){
        Nodo nuevo,anterior;
        anterior = buscarLista(testigo);
        if(anterior != null){
            nuevo = new Nodo(entrada);
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }
        return this;
    }
    public Nodo buscarLista(int destino){
        Nodo indice;
        for(indice = primero; indice != null; indice = indice.getEnlace())
            if(destino==indice.getDato())
                return indice;
        return null;
    }
    public void eliminarPrimero(){
        Nodo aux;
        if(primero !=null){
            aux=primero;
            primero=primero.getEnlace();
            aux.enlace=null;
        }else{
            System.out.println("Lista vicia");
        }
    }
    public void eliminarUltimo(){
        Nodo aux;
        if(primero !=null){
            if(primero.getEnlace()==null){
                primero=null;
            }else{
                aux=primero;
                while(aux.getEnlace().getEnlace()!=null){
                    aux = aux.getEnlace();
                    }
                aux.setEnlace(null);
                }
            }else{
            System.out.println("Lista vacia");
        }
    }
    public void eliminar(int entrada){
        Nodo actual,anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        while ((actual !=null)&&(!encontrado)){
            encontrado =(actual.getDato()== entrada);
            if(!encontrado){
                anterior = actual;
                actual = actual.getEnlace();
            }
        }
        if(actual==primero){
            primero = actual.enlace;
        }else{
            anterior.enlace=actual.enlace;
        }
        actual = null;
    }
    public static void main(final String[]args, int entrada, int testigo)throws Exception{
        Lista_EARO lista=new Lista_EARO();
        System.out.println();
        lista.insertarPrimero(entrada);
        lista.insertarUltimo(entrada);
        lista.visualizar();
        lista.eliminarPrimero();
        lista.eliminarUltimo();
        lista.insertarEntreLista(testigo,entrada);
        lista.eliminar(entrada);
    } 
}
