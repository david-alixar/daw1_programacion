package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una longitud en millas ");
        int millas = teclado.nextInt();

        System.out.print("La longitud introducida en metros es: ");
        System.out.print(millas * 1609);
    }
}
