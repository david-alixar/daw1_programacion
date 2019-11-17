package com.company;

import java.util.Scanner;

public class ej11 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número : ");
    double a = teclado.nextDouble();
    System.out.println("Introduzca un número entero no negativo : ");
    int n = teclado.nextInt();
    int veces = 2;
    double resultado = a * a;

    while (n < 0) {
      System.out.println("Error, el número no puede ser negativo. Introduzca otro:");
      n = teclado.nextInt();
    }
    teclado.close();

    while (veces < n) {
      resultado = (a * resultado);
      veces++;
    }
    System.out.println(resultado);
  }
}
