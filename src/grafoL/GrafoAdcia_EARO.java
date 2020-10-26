/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafoL;
import listaGenerica.Lista;
import listaGenerica.ListaIterador;
/**
 *
 * @author Night
 */
public class GrafoAdcia_EARO {
    int numVerts;
    static int maxVerts= 20;
    VerticeAdy []tablAdc;
    public GrafoAdcia_EARO(int mx){
        tablAdc = new VerticeAdy[mx];
        numVerts = 0;
        maxVerts =  mx;
    }
    public GrafoAdcia_EARO(){
        this(maxVerts);
    }
    public int numeroDeVertices(){
        return numVerts;
    }
    public VerticeAdy[] vertice(){
        return tablAdc;
    }
    public Lista listaAdyc(int v)throws Exception{
        if(v < 0 || v>=numVerts)throw new Exception("Vertice fuera de rango");
        return tablAdc[v].lad;
    }
    public void nuevoVertice(String nom){
        boolean esta = numVertice(nom)>=0;
        if(!esta){
            VerticeAdy v = new VerticeAdy(nom);
            v.asigVert(numVerts);
            tablAdc[numVerts++]= v;
        }
    }
    public int numVertice(String nm){
        VerticeAdy v =  new VerticeAdy(nm);
        boolean encontrado = false;
        int i = 0;
        for(;(i < numVerts)&& !encontrado;){
            encontrado = tablAdc [i].equals(v);
            if(!encontrado)i++;
        }
        return (i < numVerts)? i : -1;
    }
    public void nuevoArco(String a,String b)throws Exception{
        if(!adyacente(a,b)){
            int va = numVertice(a);
            int vb = numVertice(b);
            if(va < 0 || vb < 0)
                throw new Exception("Vertice no existe");
            Arco ab = new Arco(vb);
            tablAdc[va].lad.insertarCabezaLista(ab);
        }
    }
    boolean adyacente(String a, String b)throws Exception{
        int va, vb;
        va= numVertice(a);
        vb= numVertice(b);
        if(va < 0 || vb < 0)throw new Exception("Vertice no existe");
        if(tablAdc[va].lad.buscarLista(new Arco(vb))!=null)
            return true;
        else
            return false;
    }
    public void borrarArco(String a, String b)throws Exception{
        int va,vb;
        va= numVertice(a);
        vb= numVertice(b);
        if(va < 0 || vb <0)throw new Exception("Vertice no existe");
        Arco ab = new Arco(vb);
        tablAdc[va].lad.eliminar(ab);
    }
    static void printGraph(GrafoAdcia_EARO adj){
        System.out.println("\n\nVertices en Lista de Adyacencia");
        for (int i = 0; i < adj.tablAdc.length; i++) {
            ListaIterador list = new ListaIterador(adj.tablAdc[i].lad);
            Arco n;
            System.out.println("Lista "+adj.tablAdc[i].nombre);
            while(list.existe()!=null){
                n = (Arco)list.datos();
                System.out.println(" "+adj.tablAdc[n.destino]);
                list.siguiente();
            }
            System.out.println();
        }
    }
    
}
