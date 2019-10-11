package com.company;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el número 12 ");
        int primerNumero = teclado.nextInt();

        if (primerNumero == 12){
            System.out.println("Ha introducido el número correctamente");
        }
        else {
            System.out.println("No ha introducido el número correctamente");
        }

    }
}