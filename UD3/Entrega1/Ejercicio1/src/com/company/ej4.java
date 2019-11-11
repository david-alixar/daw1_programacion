package com.company;

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca dos números seguidos: ");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();



        teclado.close();

        System.out.println("El mayor de los números es: " + mayor(n1,n2));
    }
    public static int mayor(int n1, int n2) {
        if (n1 >= n2) {
            return n1;
        }
        else {
            return n2;
        }


    }
}