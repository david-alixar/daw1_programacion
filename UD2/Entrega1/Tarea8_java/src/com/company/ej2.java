package com.company;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print(" Introduzca la edad de los alumnos para saber su suma, su media y cuántos son mayores de edad. Use un número negativo para salir. ");
        byte primerNumero = teclado.nextByte();
        int sum_edades = 0;
        int cant_alumnos = 1;
        float media_edad = 0;
        int mayores_edad =0;

        while (primerNumero >= 0) {

            sum_edades = (sum_edades + primerNumero);
            System.out.println(" La suma de las edades introducidas es: " + sum_edades);

            media_edad = ((sum_edades) / cant_alumnos);
            System.out.println(" La media de las edades introducidas es: " + media_edad);

            System.out.println(" La cantidad de edades introducidas es: " + cant_alumnos);

            if (primerNumero >= 18) {
                mayores_edad = (mayores_edad + 1);
            }
            System.out.println(" Cantidad de  alumnos mayores de edad: " + mayores_edad);

            cant_alumnos = (cant_alumnos + 1);

            System.out.print(" Introduzca la edad del siguiente alumno para saber su suma, su media y cuántos son mayores de edad. Use un número negativo para salir. ");
            primerNumero = (teclado.nextByte());

        }



    }


}