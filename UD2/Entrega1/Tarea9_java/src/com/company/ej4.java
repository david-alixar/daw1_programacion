package com.company;

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una frase para saber si en la mitad hay un espacio o no: ");
        final String cadena1 = teclado.nextLine();

        int longitud1 = cadena1.length();
        int mitad = (longitud1 / 2);
        int mitad2 = (mitad + 1);
        String sup_esp;


        sup_esp = cadena1.substring(mitad, mitad2);
        if (sup_esp.equals(" ")) {
            System.out.println("Hay un espacio");
        } else {
            System.out.println("No hay un espacio");
        }
    }
}