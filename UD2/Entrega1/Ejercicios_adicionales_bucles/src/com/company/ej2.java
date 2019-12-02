package com.company;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" Introduzca un número para conocer el cuadrado y el cubo de los 5 próximos números). ");

        int n = teclado.nextInt();
        int i;

        for (i=n; i<= (n+5); i++) {

        System.out.printf( "%-30s  %-30s  %-10s%n", i, (Math.pow(i,2)), (Math.pow(i,3)));
        }
    }
}