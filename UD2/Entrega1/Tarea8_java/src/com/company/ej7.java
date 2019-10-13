package com.company;

import java.util.Scanner;

public class ej7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" A continuación se mostrará el producto de los 10 primeros números impares: ");
        int i;
        int impares = 1;

        for (i = 1 ; i <= 10 ; i++) {
            if (i % 2 != 0){
                impares = (i * impares);
            }
        }
        System.out.println(impares);
    }
}