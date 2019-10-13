package com.company;

import java.util.Scanner;

public class ej13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float n;
        int i;
        int suspensos = 0;
        int aprobados = 0;
        int condicionados = 0;
        System.out.println(" Introduzca las 6 calificaciones: ");

        for (i = 1; i <= 6; i++) {
            System.out.println(" Introducir calificación: ");
            n = teclado.nextFloat();
            if (n ==4) {
                condicionados++;
            }
            if (n <= 3) {
                suspensos++;
            }
            if (n >= 5) {
                aprobados++;
            }
        }
        System.out.println(" La cantidad de aprobados es: " + aprobados);
        System.out.println(" La cantidad de condicionados es: " + condicionados);
        System.out.println(" La cantidad de suspensos es: " + suspensos);
    }
}