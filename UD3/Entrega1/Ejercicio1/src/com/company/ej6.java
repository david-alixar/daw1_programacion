package com.company;

import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un caracter para indicar si es o no una vocal: ");
        char caracter = (char) teclado.nextInt();

        vocal(caracter);

        teclado.close();
    }

    public static void vocal(char caracter) {
        boolean es_vocal;
        //if (caracter.equals == "a") {
        System.out.println("Los números son iguales");

    //}


    }
}