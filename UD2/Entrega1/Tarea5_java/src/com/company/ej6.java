package com.company;

import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un valor para tiempo ");
        float tiempo = teclado.nextFloat();
        final float gravedad = 9.8f;
        float velocidad = (gravedad * tiempo);

        if (tiempo >0) {
            System.out.print(" La velocidad es: " + velocidad);
        }
        else {
            System.out.print(" Tiempo incorrecto! El valor dado para tiempo debe ser mayor que 0");
        }
    }


}
