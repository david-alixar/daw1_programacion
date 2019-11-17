package com.company;

import java.util.Scanner;

public class ej8 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.print("Introduzca un valor de n: ");
    int n = teclado.nextInt();
    teclado.nextLine();
    System.out.println(n + " tiene " + div_primos(n) + " divisores primos");
    teclado.close();
  }

  public static boolean primo(int n) {
    int contador = 2;
    boolean primo = true;

    while (contador < n) {
      if (n % contador == 0) {
        primo = false;
        break;
      }
      contador++;
    }
    return primo;
  }

  public static int div_primos(int n) {
    int num_div_primos = 0;

    // Comprobamos todos los divisores de n
    for (int i = 2; i <= n; i++) {

      // Si encontramos un divisor y además es primo...
      if (n % i == 0 && primo(i)) {
        System.out.println("El número " + i + " es divisor y primo");
        num_div_primos++;
      }
    }
    return num_div_primos;
  }
}
