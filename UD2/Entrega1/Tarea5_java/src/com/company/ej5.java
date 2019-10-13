package com.company;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número ");
        long primerNumero = teclado.nextLong();
        System.out.print("Introduzca otro número ");
        long segundoNumero = teclado.nextLong();
        System.out.print("Introduzca otro número ");
        long tercerNumero = teclado.nextLong();
        long mayor = 0l;


        if (primerNumero > segundoNumero) {
            mayor = (primerNumero);
        }
        else{
            mayor = (segundoNumero);
        }

        if (tercerNumero > mayor) {
            mayor = (tercerNumero);
        }

        System.out.print(" De los números introducidos el mayor es: " + mayor);
    }


}
