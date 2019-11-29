package com.company;

import java.util.Arrays;

public class ej1 {

    public static void main(String[] args) {
        int tamano = 9;
        int tabla[][] = new int[tamano][tamano];
        int diagonal [] = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                tabla[i][j] = (int) (Math.random() *(900-500+1) + 500);
            }
        }

        for (int n = 0; n < tamano; n++) {
            System.out.println(Arrays.toString(tabla[n]));
        }

        int i = tamano -1;
        int j = 0;
        int k = 0;

        while (i > -1 && j < tamano) {
            diagonal[k] = tabla[i][j];
            i--;
            j++;
            k++;
        }
        System.out.println("La diagonal desde la esquina inferior izquierda a la esquina superior derecha es: ");
        for (int n = 0; n < tamano; n++) {
            System.out.println(diagonal[n]);
        }
        float sum = 0;
        for (int l = 0; l < tamano; l++) {
            sum = (sum + diagonal[l]);
        }
        System.out.println(sum);
        float media = (sum/tamano);
        Arrays.sort(diagonal);
        System.out.println("El máximo de la diagonal es: " + diagonal[tamano-1]);
        System.out.println("El mínimo de la diagonal es: " + diagonal[0]);
        System.out.println("La media es: " + (media));
    }
}