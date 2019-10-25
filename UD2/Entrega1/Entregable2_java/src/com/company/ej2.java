package com.company;
import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {

        System.out.println("Introduzca un número entero positivo : ");
        Scanner teclado = new Scanner(System.in);
        long num_usuario = teclado.nextInt();
        long num_entero = num_usuario;
        long num_invertido = 0;

        while (num_entero > 0) {
            long resto = num_entero % 10;
            num_invertido = ((num_invertido *10) + resto);
            num_entero /= 10;
        }

        if (num_usuario == num_invertido) {
            System.out.println("El " + num_usuario + " es capicúa");
        }
        else {
            System.out.println("El " + num_usuario + " no es capicúa");
        }
    }
}
