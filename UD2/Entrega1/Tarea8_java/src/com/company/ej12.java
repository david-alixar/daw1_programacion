package com.company;

import java.util.Scanner;

public class ej12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float n;
        int i;
        int num_suspensos = 0;
        System.out.println(" Introduzca las 5 calificaciones : ");

        for (i = 1; i <= 5; i++) {
            System.out.println(" Introducir calificación : ");
            n = teclado.nextFloat();;
            if (n < 5) {
                num_suspensos++;
            }
        }
        if (num_suspensos >= 1 ) {
            System.out.println(" Entre las calificaciones introducidas hay suspensos! ");
        }
        else {
            System.out.println(" Entre las calificaciones introducidas no hay ningún suspenso! ");
        }
    }
}