package com.company;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un grupo de 6 números");
        final int n = 6;
        int[] variable1 = new int[n];
        int[] variable_ordenada = new int [n];
        int i;

        for (i=0; i<n; i++) {
            System.out.println("Introduzca número: ");
            variable1[i] = teclado.nextInt();
        }

        for (i=0; i<n; i++) {
            if (variable1[i] >= variable1[i+1]) {
                variable_ordenada[i] = variable1[i];

            }
        }
    }
}

