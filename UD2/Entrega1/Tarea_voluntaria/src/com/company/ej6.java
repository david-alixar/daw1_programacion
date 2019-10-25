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

        for (i= 0; i<=altura; i++) {
            for (j= 0; j<= altura - i; j++) {
                if (j== altura || i== altura) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

                System.out.println("");
            }
        }

    }
}