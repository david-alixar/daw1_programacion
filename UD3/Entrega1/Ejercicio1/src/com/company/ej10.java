package com.company;

import java.util.Scanner;

public class ej10 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int n1 = teclado.nextInt();
    teclado.nextLine();
    System.out.print("Introduzca otro número: ");
    int n2 = teclado.nextInt();
    teclado.nextLine();
    if (amigos(n1, n2)) {
      System.out.println("Los números " + n1 + " y " + n2 + " son amigos");
    } else {
      System.out.println("Los números " + n1 + " y " + n2 + " no son amigos");
    }
    teclado.close();
  }

  public static int divisores(int n) {
    int sum_divisores = 0;

    for (int i = 1; i < n; i++) {

      if (n % i == 0) {
        sum_divisores += i;
      }
    }
    return sum_divisores;
  }

  public static boolean amigos(int n1, int n2) {
    return (divisores(n1) == n2 && n1 == divisores(n2));
  }
}
