package com.company;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca las tres notas del alumno: ");
        System.out.print("Nota primer control: ");
        float nota1 = teclado.nextFloat();
        teclado.nextLine();
        System.out.print("Nota segundo control: ");
        float nota2 = teclado.nextFloat();
        teclado.nextLine();
        System.out.print("Nota tercer control: ");
        float nota3 = teclado.nextFloat();
        teclado.nextLine();
        float media = ((nota1 + nota2 + nota3) / 3);

        if (media >= 5) {
            if (media >= 5 && media < 6){
                System.out.print("Tu nota de Programación es: " + media + " - Suficiente");
            }
            if (media >= 6 && media < 7){
                System.out.print("Tu nota de Programación es: " + media + " - Bien");
            }
            if (media >= 7 && media < 9){
                System.out.print("Tu nota de Programación es: " + media + " - Notable");
            }
            if (media >= 9) {
                System.out.print("Tu nota de Programación es: " + media + " - Sobresaliente");
            }
        }

        else {
            System.out.print("Cuál ha sido el resultado de la recuperación) (apto/no apto)");
            String recuperacion = teclado.next();
                if (recuperacion.equals("apto")) {
                    System.out.print("Tu nota de Programación es: 5 - Suficiente");
                }
                else {
                    System.out.print("Tu nota de Programación es: " + media + " - Suspenso");
                }
        }



    }
}