package com.company;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números desea introducir?");
        int n = teclado.nextInt();
        int[] variable = new int[n];
        int i;
        float suma_positivos = 0;
        float suma_negativos = 0;
        float media_positivos;
        float media_negativos;
        int cant_positivos = 0;
        int cant_negativos = 0;
        int ceros = 0;
        System.out.println("Introduzca " + n + " números : ");

        for (i=0; i<n; i++) {
            variable[i] = teclado.nextInt();
        }

        for (i=0; i<n; i++) {
            if (variable[i] >= 0) {
                suma_positivos = (suma_positivos + variable[i]);
                cant_positivos++;
            }
            else{
                suma_negativos = (suma_negativos + variable[i]);
                cant_negativos++;
            }
            if (variable[i] == 0) {
                ceros++;
            }
        }
        media_positivos = (suma_positivos/cant_positivos);
        media_negativos =  (suma_negativos/cant_negativos);
        System.out.println("La media de los números positivos introducidos es: " + media_positivos);
        System.out.println("La media de los números negativos introducidos es: " + media_negativos);
        System.out.println("La cantidad de ceros introducidos es: " + ceros);

    }
}