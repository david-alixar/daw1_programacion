package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String colores [] = new String [] {"verde", "rojo", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        int cant_palabras = 8;
        String palabras [] = new String [cant_palabras];
        String definitivo [] = new String [cant_palabras];
        String no_colores [] = new String [cant_palabras];
        System.out.println("Introduzca 8 palabras:");

        for (int i = 0; i < cant_palabras; i++) {
                palabras [i] = teclado.next();
        }
        System.out.println("El array introducido es:");
        System.out.println(Arrays.toString(palabras));
        int h = 0;
        int l = 0;
            for (int i = 0; i < cant_palabras; i++) {
                for (int j = 0; j < cant_palabras; j++) {
                    if (palabras[i].equalsIgnoreCase(colores[j])) {
                        definitivo[h]=palabras[i];
                        h++;
                    }
                }
            }
            boolean color = false;
        for (int i = 0; i < cant_palabras; i++) {
            for (int j = 0; j < cant_palabras; j++) {

                if (palabras[i].equalsIgnoreCase(definitivo[j])) {
//                    definitivo[h]=palabras[i];
//                    h++;
                    color = true;
                }
            }
            if (color) {
                //definitivo[h]=palabras[i];
                //h++;
            }
            else {
                no_colores[l] = palabras[i];
                l++;
            }
            color = false;
        }

        int sin_colores = 0;
        while (h < cant_palabras) {
            definitivo[h] = no_colores[sin_colores];
            h++;
            sin_colores++;
        }
        System.out.println("El array ordenado con los colores delante es:");
        System.out.println(Arrays.toString(definitivo));
    }
}

