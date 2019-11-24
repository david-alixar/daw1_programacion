package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ej10 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("¿Cuántos números desea introducir?: ");
    int cant = teclado.nextInt();
    int[] tabla_numeros = new int[cant];
    System.out.println(RellenaPares(cant, tabla_numeros) + " números impares desechados");
    System.out.println("La tabla con los pares queda: " + Arrays.toString(tabla_numeros));
  }

  public static int RellenaPares(int cant, int[] tabla_numeros) {
    Scanner teclado = new Scanner(System.in);
    int num_impares = 0;

    int i = 0;
    int num_usuario;
    while (i < cant) {
      System.out.println("Introduzca número: ");
      num_usuario = teclado.nextInt();
      if (num_usuario % 2 == 0) {
        tabla_numeros[i] = num_usuario;
        i++;
      } else {
        num_impares++;
      }
    }
    return num_impares;
  }
}
