package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el primer número ");
        int n1 = teclado.nextInt();

        System.out.print("Introduzca el segundo número ");
        int n2 = teclado.nextInt();

        System.out.print("El resultado de la división de los dos números es: ");
        System.out.print(n1 / n2);
    }
}
