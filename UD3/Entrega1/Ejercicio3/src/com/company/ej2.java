package com.company;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una frase para saber cuántos espacios hay: ");
        final String cadena1 = teclado.nextLine();

        int longitud1 = cadena1.length();
        int n1 = 0;
        int n2 = 1;
        String sup_esp;
        int cant_espacios = 0;

        while (n2 < longitud1 -1) {
            sup_esp = cadena1.substring(n1, n2);
            if (sup_esp.equals(" ")) {
                cant_espacios++;
            }
            n1 ++;
            n2 ++;
        }
        System.out.println("Se han introducido un total de " + cant_espacios + " espacios");
    }
}