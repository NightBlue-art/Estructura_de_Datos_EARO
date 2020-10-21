/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author Night
 */
public class insertarColaL {
    public static void main(String[] args)throws Exception{
        ColaLista_EARO colaL=new ColaLista_EARO();
        System.out.println("Cola Dinamica");
        try{
            colaL.insertar("Elemento");
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            System.out.println(colaL.quitar());
        }catch(Exception e){
            System.out.println(e);
        }
        try {
            System.out.println(colaL.frenteCola());
        } catch (Exception e) {
            System.out.println(e);
        }
        colaL.borrarCola();
    }
}
