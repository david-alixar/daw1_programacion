package com.company;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num = (int) (Math.random()*100+1);
        System.out.println(" Adivine un número al azar entre 1 y 100 ");
        int num_usuario = teclado.nextInt();

        while (num!= num_usuario & num_usuario > 0 ){

            if (num_usuario < num){
                System.out.println(" El número secreto es mayor! Inténtelo de nuevo ");
            }
            else{
                System.out.println(" El número secreto es menor! Inténtelo de nuevo ");
            }
            System.out.println(" Introduzca otro número o bien use -1 para rendirse ");
            num_usuario = (teclado.nextInt());
        }

        if (num == num_usuario){
            System.out.println(" Enhorabuena! Ha acertado ");
        }
        else {
            System.out.println(" Usted se ha rendido, el resultado era " + num);
        }



    }
}