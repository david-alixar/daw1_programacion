package com.company;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");
        int num = teclado.nextInt();
        int min = num;
        int max = 0;
        float media = 0;
        int num_enteros = 0;
        int suma = 0;


        while (num != 0) {
            if (num <= min) {
                min = num;
            }
            if (num >= max) {
                max = num;
            }
            num_enteros++;
            suma= (suma + num);
            media = (suma / num_enteros);
            num = teclado.nextInt();

        }

        System.out.println("Ha introducido " + num_enteros + " números no primos");
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + media);
    }

}