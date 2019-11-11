package com.company;

import java.util.Scanner;

public class ej4 {

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos dígitos tendrá la clave secreta?");
        int n = teclado.nextInt();
        int[] clave_secreta = new int[n];
        int[] clave_usuario = new int [n];
        int i;
        int aciertos = 0;

        for (i = 0; i < n; i++) {
            clave_secreta[i] = (int) (Math.random() *6);
        }

        while (aciertos != n) {
            aciertos = 0;
            System.out.println("Intente adivinar la clave, introduciendo los " + n + " números por separado");
            for (i = 0; i < n; i++) {
                clave_usuario[i] = teclado.nextInt();
            }

            for (i = 0; i < n; i++) {
                if (clave_secreta[i] == clave_usuario[i]) {
                    System.out.println(clave_usuario[i] + (" es igual"));
                    aciertos++;
                }
                if (clave_secreta[i] < clave_usuario[i]){
                    System.out.println(clave_usuario[i] + (" es mayor"));
                }
                if (clave_secreta[i] > clave_usuario[i]){
                    System.out.println(clave_usuario[i] + (" es menor"));
                }
            }
            if (aciertos != n) {
                System.out.println("Fíjese en las pistas e inténtelo de nuevo");
            }
            else {
                System.out.println("Enhorabuena! Ha adivinado la clave secreta");
            }
        }
    }
}
