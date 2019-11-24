package com.company;

import java.util.Scanner;

public class ej9 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int[] combinacion_ganadora = {8, 5, 6, 4, 7, 9};
    int[] combinacion_usuario = new int[6];
    System.out.println("Introduzca su combinanción de la primitiva uno por uno: ");

    for (int i = 0; i < combinacion_usuario.length; i++) {

      combinacion_usuario[i] = teclado.nextInt();
    }
    System.out.println(
        "Usted tiene " + primitiva(combinacion_ganadora, combinacion_usuario) + " aciertos");
  }

  public static int primitiva(int[] combinacion_ganadora, int[] combinacion_usuario) {

    int num_aciertos = 0;
    int i = 0;
    int j = 0;
    while (i < combinacion_usuario.length && j < combinacion_ganadora.length) {
      if (combinacion_usuario[i] == combinacion_ganadora[j]) {
        num_aciertos++;
      }
      i++;
      j++;
    }

    return num_aciertos;
  }
}
