/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mOrdenacion;

/**
 *
 * @author Night
 */
public class OrdenaComp {
    static void entrada(int[]w){
        int SUP =9999;
        for (int i = 0; i < w.length; i++) {
            w[i]=(int)(Math.random()*SUP +1);
        }
    }
    public static void main(String args[]){
        final int M=10000;
        int[]v= new int [M];
        int[]c= new int [M];
        long k1,k2;
        entrada(v);
        System.arraycopy(v, 0, c, 0,v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicoOrdenacion.ordBurbuja(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenacion por burbuja: "+(k2 - k1));
        
        System.arraycopy(v, 0, c, 0,v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicoOrdenacion.ordBurbuja2(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenacion por burbuja: "+(k2 - k1));
        
        System.arraycopy(v, 0, c, 0,v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicoOrdenacion.ordIntercambio(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenacion por burbuja: "+(k2 - k1));
        
        System.arraycopy(v, 0, c, 0,v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicoOrdenacion.ordInsercion(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenacion por burbuja: "+(k2 - k1));
        
        System.arraycopy(v, 0, c, 0,v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicoOrdenacion.ordBurbuja(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenacion por burbuja: "+(k2 - k1));
        
        System.arraycopy(v, 0, c, 0,v.length);
        k1 = System.currentTimeMillis();
        MetodosAvanzadosOrdenacion.ordenacionShell(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenacion por burbuja: "+(k2 - k1));
        
        System.arraycopy(v, 0, c, 0,v.length);
        k1 = System.currentTimeMillis();
        MetodosAvanzadosOrdenacion.quicksort(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenacion por burbuja: "+(k2 - k1));
    }
}
