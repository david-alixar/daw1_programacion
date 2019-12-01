package com.company;

import java.util.Scanner;

public class ej10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la altura de la U:");
        int altura = teclado.nextInt();
        int i;
        int j;

        for (i= 0; i< altura; i++) {
            for (j= 0; j< altura-1; j++) {
                if (i== (altura -1) || j== 0 || j == (altura/2) +1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}