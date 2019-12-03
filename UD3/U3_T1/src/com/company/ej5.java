package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el valor mínimo: ");
        int a = teclado.nextInt();
        System.out.print("Introduzca el valor máximo: ");
        int b = teclado.nextInt();
        System.out.print("Introduzca la cantidad de números que deben generarse en el array: ");
        int cantidad = teclado.nextInt();


        System.out.println(Arrays.toString(aleatorioDeArray(a, b, cantidad)));

    }
    public static int [] aleatorioDeArray(int a, int b, int cantidad) {
        int n[] = new int[cantidad];
//
        for (int i = 0; i < cantidad; i++) {
            n [i] = (int) (Math.random() *(b-a+1) + a);
        }


        return n;
    }
}