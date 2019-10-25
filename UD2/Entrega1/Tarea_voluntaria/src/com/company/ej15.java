package com.company;

import java.util.Scanner;

public class ej15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la altura de la pirámide:");
        int altura = teclado.nextInt();
        int i;
        int j;

        for (i= 0; i<= 4; i++) {
            for (j= 0; j<= 4; j++) {
                if (j== 2 || i== 2 ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }


            }
            System.out.println("");
        }

    }
}