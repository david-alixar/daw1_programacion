package com.company;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su nombre y apellidos: ");
        final String cadena1 = teclado.nextLine();

        int longitud1 = cadena1.length();
        int n1 = 0;
        int n2 = 1;
        String sup_vocal;
        String cadena_final = "";
        
        while (n2 < longitud1 +1) {
            sup_vocal = cadena1.substring(n1, n2);
            if (sup_vocal.equalsIgnoreCase("a") || (sup_vocal.equalsIgnoreCase("e")) || (sup_vocal.equalsIgnoreCase("i")) || (sup_vocal.equalsIgnoreCase("o")) || (sup_vocal.equalsIgnoreCase("u")) || (sup_vocal.equalsIgnoreCase("á")) || (sup_vocal.equalsIgnoreCase("é")) || (sup_vocal.equalsIgnoreCase("í")) || (sup_vocal.equalsIgnoreCase("ó")) || (sup_vocal.equalsIgnoreCase("ú")) || (sup_vocal.equalsIgnoreCase("ü")))  {
            }
            else {
                cadena_final = cadena_final + sup_vocal;
            }
            n1 ++;
            n2 ++;
        }
        System.out.print("Su nombre y apellidos sin vocales quedarían: " + cadena_final);
    }
}