package com.company;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número entero ");
        double primerNumero = teclado.nextDouble();
        System.out.print("Introduzca otro número entero ");
        double segundoNumero = teclado.nextDouble();


        System.out.print(primerNumero + " entre " + segundoNumero + " es: ");
        System.out.print( primerNumero / segundoNumero);
    }
}