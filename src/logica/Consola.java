/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Peredo
 */
public class Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Esto es un demo");
        System.out.println("Ya sucedio el primer Commit y ahora hay cambios");
        long a = 5;
        long b = 6;
        long res = a + b;
        System.out.println(res);
        ArrayList lista = new ArrayList<>();
        lista.add(res);
        System.out.println("Apartir de ahora se utilizara long");
        System.out.println("Avanze de long");
        System.out.println("Se hizo push de long a la de int");
    }
    
}
