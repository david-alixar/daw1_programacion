package com.company;

public class ej11 {

    public static void main(String[] args) {

        System.out.println(" A continuación se mostrarán las tablas de multiplicar del 1 al 10 : ");
        int n = 1;
        int h;
        int i;

        for  (h = 1 ; h <= 10; h++) {

            System.out.println(" La tabla del " + h + " es : ");
            for (i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + n * i);
            }
            n++;
        }

    }
}