package com.company;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float[] variable = new float[5];
        int i;

        for (i=0; i<variable.length; i++) {
            System.out.println("Introduzca un número decimal: ");
            variable[i] = teclado.nextFloat();
        }

        System.out.println("Los números introducidos son: ");

        for (i=0; i<variable.length; i++) {
            System.out.println(variable[i]);
        }

    }
}