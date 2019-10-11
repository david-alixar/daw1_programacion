package com.company;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el valor del radio de la circunferencia ");
        byte primerNumero = teclado.nextByte();
        System.out.print("Introduzca 1 para calcular el diámetro, 2 para el perímetro y 3 para el área ");
        byte segundoNumero = teclado.nextByte();
        final float pi = 3.1416f;
        float resultado = 0.0f;


        if (segundoNumero == 1) {
            resultado = (2 * primerNumero);
        }
        if (segundoNumero == 2){
            resultado = (2 * pi * primerNumero);
        }
        if (segundoNumero == 3){
            resultado = (pi * primerNumero * primerNumero);
        }

        System.out.println(" El menor de estos números es : "  + resultado);



    }


}