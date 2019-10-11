package com.company;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número ");
        int primerNumero = teclado.nextInt();
        int resto = (primerNumero % 2);

        if (resto != 0){
            System.out.println( "El número introducido es impar");
        }
        else {
            System.out.println("El número introducido no es impar");
        }

    }
}