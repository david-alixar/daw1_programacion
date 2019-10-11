package com.company;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número del 1 al 10 ");
        int num = teclado.nextInt();

        switch(num) {
            case 1: System.out.println( "El número introducido es: Uno" ); break;
            case 2: System.out.println( "El número introducido es: Dos" ); break;
            case 3: System.out.println( "El número introducido es: Tres" ); break;
            case 4: System.out.println( "El número introducido es: Cuatro" ); break;
            case 5: System.out.println( "El número introducido es: Cinco" ); break;
            case 6: System.out.println( "El número introducido es: Seis" ); break;
            case 7: System.out.println( "El número introducido es: Siete" ); break;
            case 8: System.out.println( "El número introducido es: Ocho" ); break;
            case 9: System.out.println( "El número introducido es: Nueve" ); break;
            case 10: System.out.println( "El número introducido es: Diez" ); break;
            default: System.out.println( "El número debe ser entre 1 y 10!"); break;

        }

    }
}