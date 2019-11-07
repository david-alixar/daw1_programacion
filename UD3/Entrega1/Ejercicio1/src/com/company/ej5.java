package com.company;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca tres números seguidos: ");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();



        teclado.close();

       if  (mayor(n1,n2) >= n3) {
           System.out.println("El mayor es: " + mayor(n1,n2));
       }
       else {
           System.out.println("El mayor es: " + n3);
       }
    }
    public static int mayor(int n1, int n2) {
        if (n1 >= n2) {
            return n1;
        }
        else {
            return n2;
        }


    }
}