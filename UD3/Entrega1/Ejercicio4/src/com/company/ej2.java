package com.company;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números desea introducir?");
        int n = teclado.nextInt();
        int[] variable = new int[n];
        int i;

        for (i=0; i<n; i++) {
            System.out.println("Introduzca número: ");
            variable[i] = teclado.nextInt();
        }

        System.out.println("Los números introducidos son: ");

        for (i=n-1; i>=0; i--) {
            System.out.println(variable[i]);
        }

    }
}