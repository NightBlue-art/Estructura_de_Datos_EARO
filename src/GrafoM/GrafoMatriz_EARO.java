/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafoM;
import colas.ColaLista_EARO;
import pilas.PilaLista_EARO;
import GrafoM.Vertice;
/**
 *
 * @author Night
 */
public class GrafoMatriz_EARO {
        int numVerts;
        static final int maxVerts=20;
        Vertice []verts;
        int [][]matAd;
        static final int CLAVE = 0xffff;
        public GrafoMatriz_EARO(){
            this(maxVerts);
        }
        public GrafoMatriz_EARO(int mx){
            matAd=new int [mx][mx];
            verts =new Vertice[mx];
            for (int i = 0; i < mx; i++) {
                for (int j = 0; i < mx; i++) {
                    matAd[i][j] = 0;
                    numVerts=0;
                }
            }
        }
        public int numeroDeVertices(){
            return numVerts;
        }
        public Vertice[]vertices(){
            return verts;
        }
        public void nuevoVertice(String nom){
            boolean esta=numVertice(nom)>=0;
            if(!esta){
                Vertice v=new Vertice(nom);
                v.asigVert(numVerts);
                verts[numVerts++]=v;
            }
        } 
        int numVertice(String vs){
            Vertice v=new Vertice(vs);
            boolean encotrado =  false;
            int i =0;
            for(;(i<numVerts)&&!encotrado;){
                encotrado = verts[i].equals(v);
                if(!encotrado)i++;
            }
            return (i<numVerts)?i: -1;
        }
        public void nuevoArco(String a,String b)throws Exception{
            int va,vb;
            va = numVertice(a);
            vb= numVertice(b);
            if(va<0 || vb < 0)throw new Exception("Vertice no existe");
            matAd[va][vb]=1;
        }
        public  void nuevoArco(int va,int vb)throws Exception{
            if(va < 0|| vb <0)throw new Exception("Vertice no exite");
            matAd[va][vb]=1;
        }
        boolean adyacente(String a, String b)throws Exception{
            int va,vb;
            va= numVertice(a);
            vb = numVertice(b);
            if(va <0 || vb<0)throw new Exception("Vertice no exites");
            return matAd[va][vb]==1;
        }
        boolean adyacente(int va, int vb)throws Exception{
            if(va < 0||vb<0)throw new Exception("Vertice no existe");
            return matAd[va][vb]==1;
        }
        public int[]recorrerAnchura(GrafoMatriz_EARO g, String org)throws  Exception{
            int w,v;
            int []m;
            v = g.numVertice(org);
            if(v < 0)throw new Exception("Vertice origen no exite");
            ColaLista_EARO cola = new ColaLista_EARO();
            m = new int[g.numeroDeVertices()];
            for (int i = 0; i < g.numeroDeVertices(); i++)
                m[i]=CLAVE;
            m[v]=0;
            cola.insertar(Integer.valueOf(v));
            while (! cola.colaVacia()){
                Integer cw;
                cw = (Integer)cola.quitar();
                w = cw.intValue();
                System.out.println("Vertice"+g.verts[w]+"vistado");
                for(int u = 0; u < g.numeroDeVertices();u++)
                    if((g.matAd[w][u]==1)&&(m[u]== CLAVE)){
                        m[u]=m[w]+1;
                        cola.insertar(Integer.valueOf(u));
                    }
            }
            return m;
        }
        public int[]recorrerProf(GrafoMatriz_EARO g,String org)throws  Exception{
            int v, w;
            PilaLista_EARO pila = new PilaLista_EARO();
            int [] m;
            m = new int[g.numeroDeVertices()];
            v = g.numVertice(org);
            if(v<0)throw new Exception("Vertice origen no existe");
            for (int i = 0; i < g.numeroDeVertices(); i++) {
                m[i]=CLAVE;
                m[v]=0;
                pila.insertar(Integer.valueOf(v));
                while(!pila.pilaVacia()){
                    Integer cw;
                    cw =  (Integer)pila.quitar();
                    w = cw.intValue();
                    System.out.println("Vertice"+g.verts[w]+"visitado");
                    for (int u = 0; u < g.numeroDeVertices(); u++){
                        if((g.matAd[w][u]== 1)&&(m[u]==CLAVE)){
                            pila.insertar(Integer.valueOf(u));
                            m[u]=1;
                    }
                }
                return m;
                }
            }return null;
}
        public void dibujarGrafo(){
            System.out.println("  ");
            for (int i = 0; i < numVerts; i++) {
                System.out.printf(" =",i);}
            System.out.println();
            for (int i = 0; i < numVerts; i++) {
                System.out.printf("=",i);
                for (int j = 0; j < numVerts; j++) {
                    System.out.printf(" =",matAd[i][j]);
                }
                System.out.println();
            }}
   }

