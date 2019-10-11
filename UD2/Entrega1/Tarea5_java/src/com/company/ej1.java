package com.company;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número entero ");
        int primerNumero = teclado.nextInt();

        if (primerNumero >= 0){
            System.out.println( "El número introducido es positivo");
        }
        else {
            System.out.println("El número introducido es negativo");
        }

    }
}