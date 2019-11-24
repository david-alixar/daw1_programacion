package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ej6 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("¿Cuántos números desea introducir?: ");
    int cant = teclado.nextInt();
    float[] inicial = new float[cant];

    for (int i = 0; i < inicial.length; i++) {
      System.out.println("Introduzca un número decimal: ");
      inicial[i] = teclado.nextFloat();
    }
    System.out.println("Los números sin repetir son :");
    System.out.println(Arrays.toString(sin_repetidos(cant, inicial)));
  }

  public static float[] sin_repetidos(int cant, float[] inicial) {
    float[] definitivo = new float[cant];
    int i;

    int k = 0;
    for (i = 0; i < inicial.length; i++) {
      int j = 0;
      while (j < i && inicial[i] != inicial[j]) {
        j++;
      }
      if (j == i) {
        definitivo[k] = inicial[i];
        k++;
      }
    }

    return Arrays.copyOf(definitivo, k);
  }
}
