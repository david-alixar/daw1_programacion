package com.company;

import java.util.Arrays;


public class ej2 {

    public static void main(String[] args) {
        int tam1 = 6;
        int tam2 = 10;
        int n[][] = new int[tam1][tam2];

        int nuevo_num;
        for (int i = 0; i < tam1; i++) {
            for (int j = 0; j < tam2; j++) {
                nuevo_num = (int) (Math.random() * (1000 + 1) + 0);
//
                int k = 0;
                int l = 0;
                while (k < tam1) {
                    for (k = 0; k < tam1; k++) {
                        for (l = 0; l < tam2; l++)
                            if (n[k][l] == nuevo_num) {
                                nuevo_num = (int) (Math.random() * (1000 + 1) + 0);
                                break;
                            } else {
                                n[i][j] = nuevo_num;
                            }

                    }
                }
            }

        }
        for (int m = 0; m < tam1; m++) {
            System.out.println(Arrays.toString(n[m]));
        }
    }
}

