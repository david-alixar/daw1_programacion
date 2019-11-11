package com.company;

import java.util.Scanner;

public class ej11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la altura de la figura, debe ser superior a 3 e impar:");
        int altura = teclado.nextInt();
        int i;
        int j;
        if ((altura < 3) || altura %2 == 0) {
            System.out.println("Error!! La altura debe ser mayor a 3 e impar!");
        }
        else {
            for (i = 0; i < altura; i++) {
                for (j= 0; j<= altura; j++)  {
                    if (j== altura -i|| j==i+1 ) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}