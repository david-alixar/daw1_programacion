package com.company;

import java.util.Scanner;

public class ej7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número de varias cifras: ");
        String cadena1 = teclado.nextLine();

        int longitud1 = cadena1.length();
        String cadena2;
        int i;
        System.out.println("El número introducido al revés es: ");


        for (i=longitud1-1; i >= 0; i--){
            cadena2 = (cadena1.substring(i,i+1));
            System.out.print(cadena2);
        }

    }
}