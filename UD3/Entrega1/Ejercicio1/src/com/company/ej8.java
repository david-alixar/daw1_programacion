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

        // Comprobamos todos los divisores de n
        for (int i = 1; i <= n; i++) {

            System.out.println("i= " + i + " n= "+ n);
            // Si encontramos un divisor...
            if (i % n == 0) {
                boolean es_primo = true;
                System.out.println("Es divisor el " + i);

                // ... vamos a comprobar si es primo
                for (int j = 2; j < i; j++) {
                    if (j % i == 0) {
                        es_primo = false;
                        break;
                    }
                }
                if (es_primo) div_primos++;
            }
        }

        return div_primos;
    }

}
