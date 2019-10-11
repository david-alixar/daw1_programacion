package com.company;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número del 1 al 12 ");
        int mes = teclado.nextInt();

        switch(mes) {
            case 1: System.out.println( "El mes es: Enero" ); break;
            case 2: System.out.println( "El mes es: Febrero" ); break;
            case 3: System.out.println( "El mes es: Marzo" ); break;
            case 4: System.out.println( "El mes es: Abril" ); break;
            case 5: System.out.println( "El mes es: Mayo" ); break;
            case 6: System.out.println( "El mes es: Junio" ); break;
            case 7: System.out.println( "El mes es: Julio" ); break;
            case 8: System.out.println( "El mes es: Agosto" ); break;
            case 9: System.out.println( "El mes es: Septiembre" ); break;
            case 10: System.out.println( "El mes es: Octubre" ); break;
            case 11: System.out.println( "El mes es: Noviembre" ); break;
            case 12: System.out.println( "El mes es: Diciciembre" ); break;
            default: System.out.println( "El número debe ser entre 1 y 12!"); break;

        }

    }
}