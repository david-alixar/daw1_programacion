package com.company;

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número ");
        byte primerNumero = teclado.nextByte();
        System.out.print("Introduzca un segundo número ");
        byte segundoNumero = teclado.nextByte();
        int menor = 0;


        if (primerNumero < segundoNumero) {
            menor = (primerNumero);
        }
        else {
            menor = (segundoNumero);
        }

        System.out.println(" El menor de estos números es : "  + menor);

        menor = primerNumero < segundoNumero ? primerNumero : segundoNumero;


        System.out.println(" El menor de estos números es : "  + menor);


    }


}