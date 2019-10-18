package com.company;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una palabra: ");
        String cadena1 = teclado.nextLine();
        System.out.println("Introduzca otra palabra para ver cuál es más corta: ");
        String cadena2 = teclado.nextLine();

        int longitud1 = cadena1.length();
        int longitud2 = cadena2.length();

        if (longitud1 < longitud2) {
            System.out.println("La primera palabra (" + cadena1 + ") es la palabra más corta");
        }
        if (longitud1 > longitud2) {
            System.out.println("La segunda palabra (" + cadena2 + ") es la palabra más corta");
        }
        if (longitud1 == longitud2) {
            System.out.println("Ambas palabras son igual de cortas");
        }

    }
}
