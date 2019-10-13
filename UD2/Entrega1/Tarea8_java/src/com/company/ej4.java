package com.company;

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" Introduzca un número de tope. Se escribirá desde 1 hasta su número ");
        int n = teclado.nextInt();
        int n2 = 1;

        while (n2 <= n){
            System.out.println(n2);
            n2 ++;
        }
    }
}