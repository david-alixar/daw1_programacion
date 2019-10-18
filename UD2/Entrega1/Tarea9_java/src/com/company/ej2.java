package com.company;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("J1: introduzca una contraseña para ser adivinada por j2: ");
        final String cadena1 = teclado.nextLine();

        int longitud1 = cadena1.length();

        System.out.println("Pista1: número de caracteres = " + longitud1);
        System.out.println("Pista2: primer caracter = " + cadena1.charAt(0));
        System.out.println("Pista3: último caracter = " + cadena1.charAt(longitud1 - 1));

        System.out.println(" J2: adivine la contraseña introducida por j1: ");
        String cadena2 = teclado.nextLine();

        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Acertó");
        } else {
            System.out.println("Falló");
        }
    }
}