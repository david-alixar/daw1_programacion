package com.company;

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca dos números seguidos: ");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();

        mayor(n1,n2);

        teclado.close();
    }
    public static void mayor(int n1, int n2) {
        if (n1 == n2) {
            System.out.println("Los números son iguales");
        }

        if (n1 < n2) {
           int may = n2;
            System.out.println("El mayor de los números introducidos es: " + may);

        }
        if (n1 > n2) {
            int may = n1;
            System.out.println("El mayor de los números introducidos es: " + may);

        }

    }
}