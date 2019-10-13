package com.company;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print(" Introduzca un número para saber si es par, si es positivo y su cuadrado. 0 para salir. ");
        int primerNumero = teclado.nextInt();

        while (primerNumero != 0) {

            if (primerNumero % 2 == 0) {
                System.out.println(" El número introducido es par");
            } else {
                System.out.println(" El número introducido es impar");
            }
            if (primerNumero >= 0) {
                System.out.println(" El número introducido es positivo");
            } else {
                System.out.println(" El número introducido es negativo");
            }
            System.out.println("El cuadrado del número introducido es:" + (primerNumero * primerNumero));

            System.out.print(" Introduzca otro número. 0 para salir. ");
            primerNumero = (teclado.nextInt());

        }



    }


}