package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una cadena de números: ");
        String a = teclado.next();

        System.out.println(Arrays.toString(convierteArrayEnString(a)));

    }
    public static int [] convierteArrayEnString(String a) {
        int longitud = a.length();
        int n[] = new int[longitud];

        if (a.substring(0,1).equals("")) {
            return n;
        }
        else {
            int i = 0;
            int j = 0;
            while (i <= longitud - 1 && j <= longitud - 1) {
                n[j] = Integer.parseInt(a.substring(i, i + 1));
                i++;
                j++;
            }
        }

        return n;
    }
}