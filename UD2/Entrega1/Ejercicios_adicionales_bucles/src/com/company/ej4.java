package com.company;

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" Introduzca 10 números seguidos (positivos y negativos). ");

        int num;
        int i;
        int num_positivos = 0;
        int num_negativos = 0;

        for (i = 1; i<= 10; i++) {
            num = teclado.nextInt();
            if (num >= 0) {
                num_positivos++;
            }
            else {
                num_negativos ++;
            }
        }

        System.out.println(" El número de positivos Introducidos es : " + num_positivos);
        System.out.println(" El número de negativos Introducidos es : " + num_negativos);

    }
}