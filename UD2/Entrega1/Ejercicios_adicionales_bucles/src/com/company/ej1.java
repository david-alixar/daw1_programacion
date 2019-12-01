package com.company;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        final int combinacion1 = 1;
        final int combinacion2 = 2;
        final int combinacion3 = 3;
        final int combinacion4 = 4;
        System.out.println(" Introduzca una combinación de 4 dígitos para abrir la caja fuerte. Dispone de 4 intentos. ");

        int intentos = 4;
        boolean acierto = false;
        System.out.println(" Introduzca el primer dígito: ");
        int combinacion_usuario1 = teclado.nextInt();
        System.out.println(" Introduzca el segundo dígito: ");
        int combinacion_usuario2 = teclado.nextInt();
        System.out.println(" Introduzca el tercero dígito: ");
        int combinacion_usuario3 = teclado.nextInt();
        System.out.println(" Introduzca el cuarto dígito: ");
        int combinacion_usuario4 = teclado.nextInt();

        while ( intentos > 1) {
            if (combinacion1==combinacion_usuario1 && combinacion2==combinacion_usuario2 && combinacion3==combinacion_usuario3 && combinacion4==combinacion_usuario4){
                acierto = true;
                break;
            }
            else {
                System.out.println(" Lo siento, esa no es la combinación. ");
                intentos = (intentos - 1);
                System.out.println(" Inténtelo de nuevo, intentos restantes: " + intentos);
                combinacion_usuario1 = (teclado.nextInt());
                combinacion_usuario2 = (teclado.nextInt());
                combinacion_usuario3 = (teclado.nextInt());
                combinacion_usuario4 = (teclado.nextInt());
            }
        }
        if (acierto == true) {
            System.out.println(" La caja fuerte se ha abierto satisfactoriamente ");
        } else {
            System.out.println(" Lo siento, esa no es la combinación, se ha quedado sin intentos. La caja fuerte se bloquerá");
        }
    }
}

