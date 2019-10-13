package com.company;

import java.util.Scanner;

public class ej14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" Introduzca el tamaño para el lado de su triángulo: ");

            int lado = teclado.nextInt();
            int i;
            int j;

        for (j = lado; j>= 1; j--) {

            for (i = lado; i>= lado - j + 1; i--){

                System.out.print("*");
            }
        System.out.println("");

        }

    }

}