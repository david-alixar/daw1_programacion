package com.company;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la primera nota sin decimales ");
        byte primerNumero = teclado.nextByte();
        System.out.print("Introduzca la segunda nota sin decimales ");
        byte segundoNumero = teclado.nextByte();
        float suma = (primerNumero + segundoNumero);
        float resultado = (suma /2);


        System.out.print( "La media  aritmética de " + primerNumero + " y " + segundoNumero + " es: ");
        System.out.print (resultado);
    }
}