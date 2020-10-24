/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafoM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
/**
 *
 * @author Night
 */
public class EntradaGrafo_EARO {
    static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static final int CLAVE = 0xffff;
    static void grafoInverso(GrafoMatriz_EARO g, GrafoMatriz_EARO x, int n)throws  Exception{
        Vertice []vr = g.vertices();
        for (int i = 0; i < n; i++) 
            x.nuevoVertice(vr[i].nomVertice());
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if(g.adyacente(i,j)) x.nuevoArco(j,i);
                    }
    static int todosArboles(int []bosque,int n){
        int i,w;
        w=i=-1;
        do{
            if(bosque [++i] == 0)
                w=i;
        }while((i<n-1)&&(w==-1));
        return w;
    }

   
    static void entradaGrafo(GrafoMatriz_EARO gra,int n)throws Exception{
        String v , w;
        System.out.println("Lista de"+n+"vertices");
        for(int i= 1; i <=n; i++){
            v=entrada.readLine();
            gra.nuevoVertice(v);
        }
        System.out.println("Arcos, pares de vertices separados por un espacio"+"(termina con fin)");
        boolean fin = false;
        do{
            StringTokenizer r;
            r = new StringTokenizer(entrada.readLine());
            v = r.nextToken();
            if(! v.equalsIgnoreCase("fin")){
                w = r.nextToken();
                gra.nuevoArco(v, w);
            }
        else fin = true;
    }while(!fin);
}
    public static void main(String[] a)throws Exception{
        int n,i,v;
        GrafoMatriz_EARO ga;
        GrafoMatriz_EARO gaInverso;
        System.out.println("Numero de vertices del grafo: ");
        n=Integer.parseInt(entrada.readLine());
        ga=new GrafoMatriz_EARO(n);
        gaInverso = new GrafoMatriz_EARO(n);
        int[]m=new int [n];
        int[]decendientes=new int[n];
        int[]ascendientes=new int[n];
        int[]bosque=new int[n];
        entradaGrafo(ga, n);
        grafoInverso(ga, gaInverso, n);
        Vertice[]vs=new Vertice[n];
        vs=ga.vertices();
        for (i = 0; i < n; i++)
        bosque[i]=0;
        System.out.println("\n Dibujar Matriz del grafo");
        ga.dibujarGrafo();
        v = 0;
        do{
            System.out.println("\n\n Recorridos partiendo del vertice"+vs[v].nombre);
            System.out.println("\n Recorrido en profundidad de Grafo");
            m=ga.recorrerProf(ga, vs[v].nomVertice());
            System.out.println("\n Recorrido en Anchura del grafo");
            ga.recorrerAnchura(ga, vs[v].nomVertice());
            for ( i = 0; i < n; i++) {
                decendientes[i]=m[i]!=CLAVE? 1:0;
            }
            System.out.println("\nComponente conexa{");
            for(i=0; i < n; i++){
                if(decendientes[i]*ascendientes[i]==1){
                    System.out.println(" "+vs[i].nomVertice());
                }
            }
            System.out.println("}");
            v =  todosArboles(bosque, n);
        }while(v != -1);
    }
}
