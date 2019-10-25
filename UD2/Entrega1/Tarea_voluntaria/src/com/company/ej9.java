package com.company;

import java.util.Scanner;

public class ej9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la altura de la pirámide:");
        int altura = teclado.nextInt();
        int i;
        int j;
        int base = ((altura/2)+1);

        for (i= 0; i< altura; i++) {
            for (j= 0; j< base; j++) {
                if (i== (altura -1) || j== 0 ) {
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}