package com.company;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        final int combinacion = 1234;
        System.out.println(" Introduzca una combinación de 4 dígitos para abrir la caja fuerte. Dispone de 4 intentos. ");

        int intentos = 4;
        int combinacion_usuario = teclado.nextInt();

        while (combinacion != combinacion_usuario && intentos > 1) {

            System.out.println(" Lo siento, esa no es la combinación. ");
            intentos = (intentos - 1);
            System.out.println(" Inténtelo de nuevo, intentos restantes: " + intentos);
            combinacion_usuario = (teclado.nextInt());
        }
        if (combinacion_usuario == combinacion) {
            System.out.println(" La caja fuerte se ha abierto satisfactoriamente ");
        } else {
            System.out.println(" Lo siento, esa no es la combinación, se ha quedado sin intentos. La caja fuerte se bloquerá");
        }
    }
}