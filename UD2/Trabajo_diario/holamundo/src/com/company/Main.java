package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write yoSur code here

        Scanner teclado = new Scanner(System.in);
        System.out.print("Intruduzca en primer número");
        int primerNumero = teclado.nextInt();


        System.out.print("el resto es :");
        System.out.print(primerNumero * 9 + 32 / 5);
    }
}
