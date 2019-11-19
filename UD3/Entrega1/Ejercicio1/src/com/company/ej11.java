package com.company;

import java.util.Scanner;

public class ej11 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número : ");
    double a = teclado.nextDouble();
    System.out.println("Introduzca un número entero no negativo : ");
    int n = teclado.nextInt();

    while (n < 0) {
      System.out.println("Error, el número no puede ser negativo. Introduzca otro:");
      n = teclado.nextInt();
    }
    teclado.close();

    System.out.println("El resultado de la potencia es: " + potencia_iterativa(a, n));
    System.out.println("El resultado de la potencia es: " + potencia_recursiva(a, n));
  }

  public static double potencia_iterativa(double a, double n) {
    int veces = 0;
    double resultado = 1;
    while (veces < n) {
      resultado *= a;
      veces++;
    }
    return resultado;
  }

  public static double potencia_recursiva(double a, double n) {
    if (n == 0) {
      return 1;
    } else {
      return a * potencia_recursiva(a, n - 1);
    }
  }
}
