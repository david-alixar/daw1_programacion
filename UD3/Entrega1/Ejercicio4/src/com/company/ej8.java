package com.company;

import java.util.Arrays;

public class ej8 {

  public static void main(String[] args) {
    int tamano = 5;
    int tabla[][] = new int[tamano][tamano];

    for (int n = 0; n < tamano; n++) {
      for (int m = 0; m < tamano; m++) {
        tabla[n][m] = (n + m);
      }
    }
    for (int n = 0; n < tamano; n++) {
      System.out.println(Arrays.toString(tabla[n]));
    }
  }
}
