package com.company;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" Introduzca un número). ");

        int n = teclado.nextInt();
        int num1 = 0;
        int num2= 1;
        System.out.println(num1);


        while (num2 <= n) {
            System.out.println(num2);
            int temp = (num1 + num2);
            num1 = num2;
            num2 = temp;
        }
    }
}