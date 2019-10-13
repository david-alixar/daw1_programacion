package com.company;

import java.util.Scanner;

public class ej8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" Introduzca un número para conocer su factorial: ");
        int n = teclado.nextInt();
        int i;
        long factorial = 1;


        for (i = 1 ; i <= n ; i++) {
            factorial = (factorial * i);
        }

        System.out.println(" El factorial de " + n + " es: " + factorial);
    }
}