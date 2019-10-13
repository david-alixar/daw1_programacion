package com.company;

import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" A continuación se mostrarán por pantalla todos los múltiplos de 7 menores que 100: ");
        int i;

        for (i = 1 ; i <= 100 ; i++) {
            if (i % 7 == 0){
                System.out.println(i);
            }
        }

    }
}