/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.Random;

/**
 *
 * @author Night
 */
public class NumeroSuerte_EARO {
    private static void motrarCola(ColaLista_EARO q)throws Exception{
        while(!q.colaVacia()){
            Integer v;
            v = (Integer)q.quitar();
            System.out.println(" "+v.intValue());
        }
    }
    public static void main(String[] a) {
        int n,n1,n2, i;
        Integer nv;
        ColaLista_EARO q=new ColaLista_EARO();
        Random r=new Random();
        try{
            n=11+r.nextInt(49);
            for(i = 1; i <= n; i ++){
                nv= Integer.valueOf(1+r.nextInt(101));
                q.insertar(nv);
            }
            n1 = 1 +r.nextInt(11);
            System.out.println("\nSe quita de la lista: ");
            while(n1 <= n){
               Object nt;
               n2 = 0;
                for (i = 1; i < n; i++) {
                    nt = q.quitar();
                    if(i%n1==1){
                        System.out.println(nt + " ");
                    }else{
                        q.insertar(nt);
                        n2++;
                    }
                }
                n = n2;
                n1 = 1+r.nextInt(11);
            }
            System.out.println("\nLos numeros de la suerte: ");
            motrarCola(q);
            System.out.println();
        }catch(Exception e){
            System.out.println("Ha ocurrido la excepcion: "+e);
        }
    }
}
