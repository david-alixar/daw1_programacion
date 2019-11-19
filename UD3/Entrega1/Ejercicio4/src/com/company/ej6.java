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
      System.out.println(sin_repetidos(inicial,cant));

    public static float sinrepetidos (float[] inicial = new float[cant];)
    float[] ordenado = new float[cant];
    int i;


    int k = 0;
    for (i = 0; i < inicial.length; i++) {
      int j = 0;
      while (j < i && inicial[i] != inicial[j]) {
        j++;
      }
      if (j == i) {
        ordenado[k] = inicial[i];
        k++;
      }
    }

    Arrays.copyOf(ordenado, k);
    System.out.println(Arrays.toString(ordenado));
  }
}
