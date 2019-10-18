package com.company;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una frase para saber si en la mitad hay un espacio o no: ");
        final String cadena1 = teclado.nextLine();

        String jav_lon;


        jav_lon = cadena1.substring(0, 15);
        if (jav_lon.equals("Javalín, javalón")) {
            System.out.println("Javalín, Javalón");
        } else {
            System.out.println("No hay un espacio");
        }
    }
}