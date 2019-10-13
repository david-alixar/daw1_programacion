package com.company;

import java.util.Scanner;

public class ej15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Introduzca un número para ver cuántos primos hay hasta este número : ");

        boolean primo;
        int n = teclado.nextInt();
        int i;
        int j;
        int cant_primos = 0;

       for (i = 1 ; i <= n; i++) {
           primo = true;
           j = 2;
           while (j <= i -1 && primo == true) {
               if (i % j == 0) {
                   primo = false;
               }
               j++;
           }
           if (primo) {
               cant_primos++;
           }
       }
       System.out.println(" Hasta el " + n + ", hay " + cant_primos + " números primos");
    }
}

