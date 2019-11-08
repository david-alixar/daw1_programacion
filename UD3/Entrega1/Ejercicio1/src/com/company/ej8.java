package com.company;

import java.util.Scanner;

public class ej8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un valor de n: ");
        int n = teclado.nextInt();
        teclado.close();
        System.out.println(primos2(n));
    }

    public static int primos2(int n) {
        int div_primos = 0;

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i -1; j++)
                if (i % j == 0) {
                    div_primos++;
                    break;
                }
        }
        return div_primos;
    }
}
