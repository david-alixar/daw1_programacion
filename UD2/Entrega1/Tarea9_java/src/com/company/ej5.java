package com.company;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una frase para saber si está en idioma javalandia o no: ");
        String cadena1 = teclado.nextLine();

        String muletilla_inicio = "Javalín,javalón";
        String muletilla_final = "Javalén,len,len"; //15


        int longitud_muletilla2 = muletilla_final.length();


        if (cadena1.length() < longitud_muletilla2) {

            System.out.println(" La frase no está escrita en idioma javalandia");

        } else {
            String jav_lon;
            jav_lon = cadena1.substring(0, muletilla_inicio.length());
            String n2 = cadena1.substring(muletilla_inicio.length(), cadena1.length());
            String jav_len;
            jav_len = cadena1.substring(cadena1.length() - longitud_muletilla2, cadena1.length());
            String n3 = cadena1.substring(0, cadena1.length() - longitud_muletilla2);

            if (jav_lon.equals(muletilla_inicio)) {
                System.out.println("La frase está escrita en idima javalandia sin dialecto");
                System.out.println("La frase sin la coletilla es: " + (n2));

            }

            if (jav_len.equals(muletilla_final)) {
                System.out.println("La frase está escrita en idioma javalandia con dialecto");
                System.out.println("La frase sin la coletilla es: " + (n3));
            }

            if (!jav_lon.equals(muletilla_inicio) && !(jav_len.equals(muletilla_final))) {
                System.out.println("La frase no está escrita en idioma de Javalandia");
            }
        }


    }


}

