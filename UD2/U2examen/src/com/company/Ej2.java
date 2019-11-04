package com.company;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        String cadena1 = teclado.nextLine();
        System.out.println("Introduzca la posición donde desea cortarlo: ");
        int corte = teclado.nextInt();
        int longitud1 = cadena1.length();
        String primera_parte;
        String segunda_parte;
        int num_vocales = 0;
        System.out.println("El número de vocales es: ");

            primera_parte = cadena1.substring(0,corte-1);
            segunda_parte = cadena1.substring(corte-1,longitud1);

        System.out.println("Los números partidos son: " + primera_parte + " y " + segunda_parte);

    }
}