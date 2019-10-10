package com.company;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el primer número ");
        byte primerNumero = teclado.nextByte();
        System.out.print("Introduzca el segundo número ");
        byte segundoNumero = teclado.nextByte();


        System.out.print("La suma de " + primerNumero + " más " + segundoNumero + " es: ");
        System.out.print(primerNumero + segundoNumero);
    }
}