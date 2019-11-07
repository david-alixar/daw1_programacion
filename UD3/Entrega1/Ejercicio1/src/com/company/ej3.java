package com.company;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el radio de la base del cilindro: ");
        float r = teclado.nextFloat();
        System.out.println("Introduzca la altura del cilindro");
        float h = teclado.nextFloat();
        System.out.println("¿Qué desea calcular del cilindro?  "); //
        System.out.println("1 para área");
        System.out.println("2 para el volumen");
        int funcion = teclado.nextInt();

        while (funcion != 1 && funcion != 2) {
            System.out.println("Error!! Introduzca 1 para saber el área del cilindro y 2 para el volumen: ");
            funcion = teclado.nextInt();
        }

        if (funcion == 1) {
            area(r,h);
        }
        else {
            volumen(r,h);
        }

        teclado.close();
    }
    public static void area (float r, float h) {
        double areaTotal = 2 * Math.PI * r * (h+r);
        System.out.println("El área total del cilindro es: " + areaTotal);
    }
    public static void volumen (float r, float h) {
        double volumen = Math.PI * Math.pow(r,2) * h;
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}