package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una temperatura en ºC ");
        int centigrados = teclado.nextInt();

        System.out.print("La temperatura introducida en ºF es: ");
        System.out.print(centigrados * 9 / 5 + 32);
    }
}
