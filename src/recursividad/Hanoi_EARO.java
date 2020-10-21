/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author Night
 */
public class Hanoi_EARO {
    public void hanoi(char varinicial,char varcentral,char varfinal, int n){
        if (n==1){
            System.out.println("Mover disco"+n+"desde varilla"+varinicial+"a varilla"+varfinal);
        }else{
            hanoi(varinicial,varfinal,varcentral,n-1);
            System.out.println("Mover disco"+n+"desde varilla"+varinicial+"a varilla"+varfinal);
            hanoi(varinicial, varcentral, varfinal, n-1);
        }
    }
    public void hanoi(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        hanoi('A','B','C',n);
        sc.close();
    }
}
