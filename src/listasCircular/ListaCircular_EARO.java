/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasCircular;

/**
 *
 * @author Night
 */
public class ListaCircular_EARO {

    private static String entrada;
    private Nodo lc;
    public ListaCircular_EARO(){
        lc=null;
    }
    public ListaCircular_EARO insertar(String entrada){
        Nodo nuevo;
        nuevo =  new Nodo(entrada);
        if (lc != null){
            nuevo.enlace =  lc.enlace;
            lc.enlace =  nuevo;}
        lc =  nuevo;
        return this;
        }
    public void recorrer(){
        Nodo p;
        if(lc != null){
            p = lc.enlace;
            do{
                System.out.print("\t"+ p.dato);
                p =  p.enlace;
            }while (p != lc.enlace);
            }else{
            System.out.println("\t Lista Circular vacia");
        }
    }
    public void eliminar(String entrada){
        Nodo actual;
        actual =  lc;
        while((actual.enlace != lc) && !(actual.enlace.dato.equals(entrada))){
        if(!actual.enlace.dato.equals(entrada))
            actual=actual.enlace;
    }
        if(actual.enlace.dato.equals(entrada)){
            Nodo p;
            p= actual.enlace;
            if(lc == lc.enlace)
                lc=null;
            else{
                if(p==lc){
                    lc=actual;
                }
                actual.enlace=p.enlace;
            }
            p=null;
        }
    }
    public void eliminarLc(){
        Nodo p;
        if(lc!=null){
            p=lc.enlace;
            if(lc==p)
                lc=null;
            else{
                if(p==lc)lc=p;
                lc.enlace=p.enlace;
            }
            p=null;
        }else
            System.out.println("\n Lista vacia");
    }
    public void borrarLista(){
        Nodo aux;
        if(lc!=null){
            aux=lc;
            do{
                aux=aux.enlace;
            }while(aux != lc);
            }else
            System.out.println("\n\t Lista vacia");
        lc=null;
        }
    public void visualizar(){
        Nodo p;
        if(lc != null){
            p =  lc.enlace;
            do{
                System.out.print("\t"+p.dato);
                p=p.enlace;
            }while(p != lc.enlace);
        }
        else System.out.println("\t Lista Circular Vacia");
    }
    public static void main(String[] args) {
        ListaCircular_EARO listaC=new ListaCircular_EARO();
        System.out.println("Lista Enlazada Circular");
        listaC.insertar(entrada);
        listaC.visualizar();
        listaC.eliminar(entrada);
        listaC.borrarLista();
    }

}
