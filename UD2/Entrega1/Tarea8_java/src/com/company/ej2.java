package com.company;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print(" Introduzca la edad de los alumnos para conocer sus estadísticas. Use un número negativo para salir. ");
        byte edad = teclado.nextByte();
        float sum_edades = 0;
        int cant_edades = 1;
        float media_edad = 0.0f;
        int mayores_edad =0;

        while (edad >= 0) {

            sum_edades = (sum_edades + edad);
            System.out.println(" La suma de las edades introducidas es: " + sum_edades);

            media_edad = ((sum_edades) / cant_edades);
            System.out.println(" La media de las edades introducidas es: " + media_edad);

            System.out.println(" La cantidad de edades introducidas es: " + cant_edades);

            if (edad >= 18) {
                mayores_edad = (mayores_edad + 1);
            }
            System.out.println(" Cantidad de alumnos mayores de edad: " + mayores_edad);

            cant_edades = (cant_edades + 1);

            System.out.println(" Introduzca la edad del siguiente alumno para sus estadísticas. Use un número negativo para salir. ");
            edad = (teclado.nextByte());

        }



    }


}