package com.company;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" Introduzca un rango de números (un máximo y un mínimo) ");
        System.out.println(" Introduzca un valor máximo:  ");
        final int max = teclado.nextInt();
        System.out.println(" Introduzca un valor mínimo: ");
        final int min = teclado.nextInt();
        System.out.println(" Introduzca un número dentro de su rango ");
        int num_usuario = teclado.nextInt();

        while (num_usuario < min || num_usuario > max) {
          System.out.println(" El número introducido está fuera de rango! Introduzca otro: ");
          num_usuario = teclado.nextInt();
        }
        System.out.println(" El valor introducido se encuentra dentro del rango establecido ");
    }
}