package com.company;

import java.util.Arrays;

public class ej1 {

    public static void main(String[] args) {
        String paises[] = new String[]{"España", "Rusia", "Japón","Australia"};
        int cant_centimetros = 10;
        int cant_filas = 4;
        int lim_estadisticas = 3;
        int centimetros [][] = new int [cant_filas] [cant_centimetros];
        int centimetros_copia [][] = new int [cant_filas] [cant_centimetros];
        int estadisticas [][] = new int [cant_filas] [lim_estadisticas];

        for (int i = 0; i < cant_filas; i++) {
            for (int j = 0; j < cant_centimetros; j++) {
                centimetros[i][j] = (int) (Math.random() *(210-140+1) + 140);
                centimetros_copia[i][j] = centimetros[i][j];
            }
        }
        for (int i = 0; i < cant_filas; i++) {
            Arrays.sort(centimetros_copia[i]);
        }

        for (int i = 0; i < cant_filas; i++) {
                estadisticas[i][1] = centimetros_copia[i][0];
        }
        for (int i = 0; i < cant_filas; i++) {
                estadisticas[i][2] = centimetros_copia[i][cant_centimetros-1];
        }

        for (int i = 0; i < cant_filas; i++) {
            System.out.println(paises[i]+Arrays.toString(centimetros[i])+Arrays.toString(estadisticas[i]));
        }
    }
}