package com.company;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la altura de la pirámide:");
        int altura = teclado.nextInt();
        int i;
        int j;
        System.out.println("Introduzca un caracter para construir la pirámide:");

        String cadena;
        cadena = teclado.next();

       for (i= 0; i<= altura; i++) {
            for (j= altura - i; j> 0; j--) {
                System.out.print(" ");
            }
            for (j= 0; j< i; j++) {
                System.out.print(" " +cadena);            }
            System.out.println("");
        }
    }
}