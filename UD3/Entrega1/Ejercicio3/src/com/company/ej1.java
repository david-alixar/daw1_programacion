package com.company;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String frase = "";
        System.out.println("Introduzca una palabra: ");
        String palabra = teclado.next();

        while (!palabra.equalsIgnoreCase("fin")) {
            frase = frase + " " + palabra;
            System.out.println("Introduzca otra palabra, 'fin' para salir");
            palabra = teclado.next();
        }
        System.out.println(frase);

    }
}