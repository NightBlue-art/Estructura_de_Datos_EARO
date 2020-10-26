/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafoL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import listaGenerica.Lista;
/**
 *
 * @author Night
 */
public class EntradaGrafo {
    public static void main(String args[]) throws IOException, Exception{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String v,w;
        int nm;
        try{
            int n;
            System.out.println("Numero de nodos: ");
            n= Integer.parseInt(entrada.readLine());
            GrafoAdcia_EARO gra = new GrafoAdcia_EARO(n);
            System.out.println("Lista de "+n+"Vertices");
            for (int i = 1; i <=n; i++) {
                v =entrada.readLine();
                gra.nuevoVertice(v);
            }
            System.out.println("Arcos, pares de vertices separados por un espacio");
            boolean fin = false;
            do{
                StringTokenizer r;
                r = new StringTokenizer(entrada.readLine());
                v = r.nextToken();
                if(!v.equalsIgnoreCase("fin")){
                    w=r.nextToken();
                    gra.nuevoArco(v , w);
                }
                else fin=true;
            }while(!fin);
            System.out.println("Vertices del grafo");
            VerticeAdy []vs=new VerticeAdy[n];
            vs = gra.vertice();
            for (int i = 0; i < n; i++) {
                System.out.println(vs[i]+"\n");
                do{
                    System.out.println("1.Mostrar Grafo\n");
                    System.out.println("2.Añadir Arco\n");
                    System.out.println("3.Borrar Arco\n");
                    System.out.println("4.Mostrar Grafo\n");
                    System.out.println("5.Salir\n");
                    do
                        nm= Integer.parseInt(entrada.readLine());
                    while(nm < 1 || nm >5);
                    if(nm == 1){
                        GrafoAdcia_EARO.printGraph(gra);
                    }
                    else if(nm == 2){
                        try{
                            System.out.println("Arcos, pares de vertices separados por un espacio");
                            StringTokenizer r;
                            r= new StringTokenizer(entrada.readLine());
                            v = r.nextToken();
                            w= r.nextToken();
                            gra.nuevoArco(v,w);
                       }catch(Exception e){
                            System.out.println(e);
                       }}
                        else if(nm==3){
                                try{
                                System.out.println("Arcos a eliminar, pares de vertices separados por un espacio");
                                StringTokenizer r;
                                r= new StringTokenizer(entrada.readLine());
                                v = r.nextToken();
                                w = r.nextToken();
                                gra.borrarArco(v,w);
                                }catch(Exception e){
                                System.out.println(e);
                                }
                                }
                        else if(nm==4){
                                try{
                                String ady=" ";
                                System.out.println("Vertices a comparar, pares de vertices separados por un espacio");
                                StringTokenizer r;
                                r = new StringTokenizer(entrada.readLine());
                                v = r.nextToken();
                                w = r.nextToken();
                                if(gra.adyacente(v,w))ady="si";else ady="No";
                                System.out.println("Los vertices"+v+" "+w+" "+ady+"Son adyacentes");
                                }catch(Exception e){
                                System.out.println(e);
                                }
                                }
                    }while(nm!=5);
            }}catch(Exception e){
                            System.out.println("Error en la entrada del grafo"+e);
                            }
                }
                }
                
