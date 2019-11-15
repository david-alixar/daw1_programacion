package com.company;

import java.util.Scanner;

public class ej12 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número para conocer su factorial: ");
    int n1 = teclado.nextInt();

    teclado.close();

    System.out.println("El factorial de " + n1 + " es: " + factorial(n1));
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}
