/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Night
 */
public class Factorial_EARO {
    static long fatorial(int n){
        if(n <= 1)
            return 1;
        else{
            long resultado = n * fatorial(n -1);
            return resultado;
        }
    }
    public static void main(String[] ar) throws IOException {
        int n;
        BufferedReader entrada =  new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("Introduzca numero n: ");
            n= Integer.parseInt(entrada.readLine());
        }while (n<=0);
        System.out.println("\n \t"+ n + "!="+fatorial(n));
        }
}
 