package com.company;

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número con decimales para redondearlo ");
        float primerNumero = teclado.nextFloat();


        System.out.print( "Su número redondeado es: ");
        System.out.print (Math.round(primerNumero));
    }
}