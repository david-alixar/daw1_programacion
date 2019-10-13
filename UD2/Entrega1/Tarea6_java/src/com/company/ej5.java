package com.company;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el valor del radio de la circunferencia ");
        float primerNumero = teclado.nextFloat();
        System.out.println(" Introduzca: ");
        System.out.println(" 1 para diámetro ");
        System.out.println(" 2 para perímetro ");
        System.out.println(" 3 para el área ");
        byte segundoNumero = teclado.nextByte();
        final float pi = 3.1416f;
        float resultado = 0.0f;


        if (segundoNumero == 1) {
            resultado = (2 * primerNumero);
            System.out.println(" El diámetro de la circunferencia es : "  + resultado);
        }
        if (segundoNumero == 2){
            resultado = (2 * pi * primerNumero);
            System.out.println(" El perímetro de la circunferencia es : "  + resultado);
        }
        if (segundoNumero == 3){
            resultado = (pi * primerNumero * primerNumero);
            System.out.println(" El área de la circunferencia es : "  + resultado);
        }





    }


}