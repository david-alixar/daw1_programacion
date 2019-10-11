package com.company;

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número ");
        int primerNumero = teclado.nextInt();
        System.out.print("Introduzca otro número ");
        int segundoNumero = teclado.nextInt();
        int num_pares1 = 0;
        int num_pares2 = 0;


        if ((primerNumero % 2) == 0) {
            num_pares1 = (num_pares1 + 1);
        }

        if ((segundoNumero % 2) == 0) {
            num_pares2 = (num_pares2 + 1);
        }


        int num_pares = (num_pares1 + num_pares2);

        System.out.print(" La cantidad de números pares introducidos es: " + num_pares);
        }


    }
