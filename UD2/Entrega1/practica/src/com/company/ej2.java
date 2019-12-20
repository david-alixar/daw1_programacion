package com.company;
import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {

        System.out.println("Introduzca un número entero positivo: ");
        Scanner teclado = new Scanner(System.in);
        long num_usuario = teclado.nextInt();
        long num_entero = num_usuario;
        long num_invertido = 0;
        System.out.println("¿En qué posición desea cambiar el número?");
        int pos_usuario = teclado.nextInt();
        System.out.println("¿Qué número desea colocar en esa posición?");
        int nuevo_num = teclado.nextInt();
        int pos = 1;
        long num_definitivo = 0;

        while (num_entero > 0) {
            long resto = num_entero % 10;
            num_invertido = ((num_invertido *10) + resto);
            num_entero /= 10;
        }
        num_entero = num_invertido;


        while (pos < pos_usuario) {
            long resto = num_entero % 10;
            num_definitivo = ((num_definitivo * 10) + resto);
            num_entero /= 10;
            pos++;
        }
        num_definitivo = ((num_definitivo * 10) + nuevo_num);
        num_entero /= 10;

        while (num_entero > 0) {
            long resto = num_entero % 10;
            num_definitivo = ((num_definitivo * 10) + resto);
            num_entero /= 10;
        }


        System.out.println("El número quedaría: " + num_definitivo);
    }
}