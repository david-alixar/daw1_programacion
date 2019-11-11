package com.company;

import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un caracter para indicar si es o no una vocal: ");
        String caracter = teclado.next();

        vocal(caracter);

        teclado.close();
    }

    public static void vocal(String caracter) {
        boolean es_vocal;
        if (caracter.equalsIgnoreCase ("a")|| caracter.equalsIgnoreCase ("e") || caracter.equalsIgnoreCase ("i") || caracter.equalsIgnoreCase ("o") || caracter.equalsIgnoreCase ("u")) {
            es_vocal = true;
        }
        else {
            es_vocal = false;
        }
        System.out.println("Es una vocal: " + es_vocal);
    }
}