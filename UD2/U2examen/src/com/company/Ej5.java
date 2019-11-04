package com.company;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        String cadena1 = teclado.nextLine();

        int longitud1 = cadena1.length();
        String vocales = ("a,e,i,o,u,á,é,í,ó,ú,ü");
        int longitud2 = vocales.length();
        int i;
        int j;
        char vocal = 0;
        char sup_vocal;
        int num_vocales = 0;
        System.out.println("El número de vocales es: ");

        for ( i= 0; i<=longitud1-1; i++) {
            sup_vocal = cadena1.charAt(i);
            for (j= 0; j<=longitud2-1; j++ )
                vocal = vocales.charAt(j);
                if (sup_vocal == vocal) {
                    num_vocales ++;
                    System.out.println(num_vocales);
            }
        }
        System.out.println(num_vocales);

    }
}