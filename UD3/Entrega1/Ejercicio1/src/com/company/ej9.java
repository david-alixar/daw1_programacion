package com.company;

import java.util.Scanner;

public class ej9 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.print("Introduzca un valor de n: ");
    int n = teclado.nextInt();
    teclado.nextLine();
    div_primos(n);
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

  public static void div_primos(int n) {

    System.out.println("los siguientes números son divisores primos de " + n + ": ");
    // Comprobamos todos los divisores de n
    for (int i = 2; i <= n; i++) {

      // Si encontramos un divisor y además es primo...
      if (n % i == 0 && primo(i)) {
        System.out.println(i);
      }
    }
  }
}
