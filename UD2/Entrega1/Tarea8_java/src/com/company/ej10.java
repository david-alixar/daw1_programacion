package com.company;

import java.util.Scanner;

public class ej10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" Introduzca un número del 1 al 10 para conocer su tabla de multiplicar: ");
        int n = teclado.nextInt();
        int i;

        while (n > 10 | n < 1) {
            System.out.println(" El número introducido debe ser entre 1 y 10 para poder continuar! Ingrese otro : ");
            n = teclado.nextInt();
        }

        System.out.println(" La tabla del " + n + " es : ");
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

    }
}