package com.company;

import java.util.Scanner;

public class ej7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un valor de n: ");
        int n = teclado.nextInt();
        primo(n);
        teclado.close();
    }

    public static void primo(int n) {
        int contador = 2;
        boolean primo = true;

        while (contador != n-1) {
            if (n % contador == 0) {
                primo = false;
                break;
            }
            contador++;
        }

        System.out.print(primo);
    }
}

