package com.company;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long a = teclado.nextLong();
        teclado.nextLine();
        System.out.print("Introduzca otro número: ");
        long b = teclado.nextLong();
        teclado.close();
        System.out.println("Los dos números unidos quedarían: " + juntaNumeros(a,b));
    }

    public static long juntaNumeros(long a, long b) {
        long c = 0;
        while (b > 0){
            long resto = b % 10;
            c = ((c *10) + resto);
            b /= 10;
        }
        while ( a > 0){
            long resto = a % 10;
            c = ((c *10) + resto);
            a /= 10;
        }
        long num_juntos = 0;
        while ( c > 0){
            long resto = c % 10;
            num_juntos = ((num_juntos *10) + resto);
            c /= 10;
        }

        return num_juntos;
    }

}
