package com.company;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un valor de n: ");
        int n = teclado.nextInt();

        eco(n);

        teclado.close();

    }

    public static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Eco....");
        }
    }
}