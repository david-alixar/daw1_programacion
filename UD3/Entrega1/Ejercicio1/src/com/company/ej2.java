package com.company;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca dos números seguidos: ");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();

        numeros(n1,n2);

        teclado.close();
    }
    public static void numeros(int n1, int n2) {
        if (n1 == n2) {
            System.out.println("Los números son iguales");
        }

        if (n1 < n2) {
            System.out.println("Los números comprendidos entre los dos introducidos son: ");
            for (int i = n1; i < n2; i++) {
                System.out.println(n1 + 1);
                n1++;
            }
        }
        if (n1 > n2) {
            System.out.println("Los números comprendidos entre los dos introducidos son: ");
            for (int i = n1; i > n2; i--) {
                System.out.println(n1 - 1);
                n1--;
            }
        }

    }
}