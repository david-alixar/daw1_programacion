package com.company;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la altura de la pirámide");
        int altura = teclado.nextInt();
        int i;
        int k;
        System.out.println("Introduzca un caracter para construir la pirámide");
        int n = teclado.nextInt();

        for (i= 0; i< altura; i++) {
            for (k= altura - i; k> 0; k--) {
                System.out.print(" ");
            }
            for (k= 0; k< i; k++) {
                System.out.print(" "+n);
            }
            System.out.println("");
        }
    }
}