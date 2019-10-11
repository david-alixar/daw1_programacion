package com.company;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número ");
        int primerNumero = teclado.nextInt();
        int num_par = 0;


        if ((primerNumero % 2) == 0) {
            num_par = (num_par + 1);
        }

        System.out.println(" Saldrá 1 si es par ó 0 si es impar: " + num_par);

        num_par = primerNumero % 2 == 0 ? 1 : 0;

        System.out.println(" Saldrá 1 si es par ó 0 si es impar: " + num_par);

    }


}