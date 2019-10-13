package com.company;

import java.util.Scanner;

public class ej9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int etiquetaArbol,
                alturaArbol;
        int etiqueta = 0;
        int altura;
        System.out.println(" Introduzca en centímetros la altura del árbol: ");
        altura = teclado.nextInt();

        alturaArbol = altura;
        etiquetaArbol = 0;

        while (altura != -1) {
            if (altura > alturaArbol) {
                alturaArbol = altura; // ver
                etiquetaArbol = etiqueta;
            }
            System.out.println(" Etiqueta: " + etiqueta);
            etiqueta ++;
            System.out.println(" Introduzca en centímetros la altura del siguiente árbol: ");
            altura = teclado.nextInt();
        }
        System.out.println("El árbol más alto mide: " + alturaArbol + " y este tiene la etiqueta " + etiquetaArbol);

    }
}