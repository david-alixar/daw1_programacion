package com.company;

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una longitud en millas ");
        float primerNumero = teclado.nextFloat();
        float segundoNumero = 1.609f;


        System.out.print("La longitud introducida en kilómetros es: ");
        System.out.print( primerNumero * segundoNumero);
    }
}