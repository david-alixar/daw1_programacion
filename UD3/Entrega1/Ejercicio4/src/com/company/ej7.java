package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ej7 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    final short num_alumnos = 5;
    final short num_trim = 3;
    int notas[][] = new int[3][num_alumnos];

    for (int j = 0; j < num_trim; j++) {
      System.out.println("Introduzca las notas del trimestre " + (j + 1) + ": ");
      for (int i = 0; i < num_alumnos; i++) {
        notas[j][i] = teclado.nextInt();
      }
    }

    System.out.println(Arrays.toString(notas[0]));
    System.out.println(Arrays.toString(notas[1]));
    System.out.println(Arrays.toString(notas[2]));

    int sum = 0;

    for (int i = 0; i < num_trim; i++) {
      for (int j = 0; j < num_alumnos; j++) {
        sum = notas[i][j] + sum;
      }
      System.out.println(
          "Las nota media del trimestre " + (i + 1) + " es: " + (double) (sum / num_alumnos));
      sum = 0;
    }
    System.out.println(
        "Introduzca un número para conocer la media de un alumno (del 0 al "
            + (num_alumnos - 1)
            + ")");
    int pos = teclado.nextInt();
    sum = notas[0][pos] + notas[1][pos] + notas[2][pos];
    System.out.println(
        "La media del alumno de la posición " + pos + " es: " + (double) (sum / num_trim));
  }
}
