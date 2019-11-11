package com.company;

import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la altura de la pirámide:");
        int altura = teclado.nextInt();
        int i;
        int j;
        System.out.println("Introduzca un caracter para construir la pirámide:");
        String cadena;
        cadena = teclado.next();
        for (i = 0; i < altura; i++) {
            for (j = altura-1; j >= 0; j--) {
                if (j == i || i >= altura - 1) {
                    System.out.print(" " + cadena);
                } else {
                    System.out.print(" ");
                }
            }
            for (j = 0; j <= altura; j++) {
                if (j == i -1) {
                    System.out.print(cadena + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}