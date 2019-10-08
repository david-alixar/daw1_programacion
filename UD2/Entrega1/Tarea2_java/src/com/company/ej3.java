package com.company;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su año de nacimiento ");
        short primerNumero = teclado.nextShort();
        System.out.print("Introduzca el año actual ");
        short segundoNumero = teclado.nextShort();


        System.out.print("Usted nació en " + primerNumero + " y en " + segundoNumero + " su edad es: ");
        System.out.print( segundoNumero - primerNumero);
    }
}