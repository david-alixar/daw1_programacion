package com.company;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la primera nota ");
        float primerNumero = teclado.nextFloat();
        System.out.print("Introduzca la segunda nota ");
        float segundoNumero = teclado.nextFloat();
        System.out.print("Introduzca la tercera nota ");
        float tercerNumero = teclado.nextFloat();

        float resultado = ((primerNumero + segundoNumero + tercerNumero) /3);
        float resultado1 = (byte) resultado;


        System.out.print( "La media  aritmética es: ");
        System.out.print (Math.round(resultado1));
    }
}