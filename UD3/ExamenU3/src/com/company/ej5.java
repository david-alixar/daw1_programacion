package com.company;

import java.util.Arrays;

public class ej5 {

    public static void main(String[] args) {
        int tam1 = 4;
        int tam2 = 6;
        int n[][] = new int[tam1][tam2];

        for (int i = 0; i < tam1; i++) {
            for (int j = 0; j < tam2; j++) {
                n[i][j] = (int) (Math.random() *(500-200+1) + 200);
            }
        }

        for (int i = 0; i < tam1; i++) {
            System.out.println(Arrays.toString(n[i]));
        }

        System.out.println(Arrays.toString(corteza(n, tam1, tam2)) + "son la corteza de la matriz ");

    }
    public static int [] corteza(int [][] n, int tam1, int tam2) {
        int num_corteza [] = new int[200];
//        for (int i = 0; i < tam2; i++) {
//
//        }
        int i = 0;
        int j = 0;
        int k= 0;
        while (j < tam2-1) {
            num_corteza[k] = n[i][j];
            j++;
            k++;
        }
        i = 0;
        j = tam2 -1;
        while (i < tam1) {
            num_corteza[k] = n[i][j];
            i++;
            k++;
        }
        i = tam1 -1;
        j= tam2 -2;
        while (j > 0) {
            num_corteza[k] = n[i][j];
            j--;
            k++;
        }
        i = tam1-1;
        j = 0;
        while (i > 0) {
            num_corteza[k] = n[i][j];
            i--;
            k++;
        }


        return Arrays.copyOf(num_corteza, k);
    }
}