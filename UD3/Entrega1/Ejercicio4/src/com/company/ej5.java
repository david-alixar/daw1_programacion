package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ej5 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un grupo de 6 números");
    final int n = 6;
    final int n2 = 12;
    int[] variable1 = new int[n];
    int[] variable2 = new int[n];
    int[] variable3 = new int[n2];

    for (int i = 0; i < n; i++) {
      System.out.println("Introduzca número: ");
      variable1[i] = teclado.nextInt();
    }

    System.out.println("Introduzca otro grupo de 6 números");
    for (int i = 0; i < n; i++) {
      System.out.println("Introduzca número: ");
      variable2[i] = teclado.nextInt();
    }

    Arrays.sort(variable1);
    Arrays.sort(variable2);

    System.out.println(Arrays.toString(variable1));
    System.out.println(Arrays.toString(variable2));

    int i = 0;
    int j = 0;
    int k = 0;

    while (k < n2) {
      if (variable1[i] <= variable2[j]) {
        variable3[k] = variable1[i];
        System.out.println("Insertando de variable1. i=" + i + " valor=" + variable1[i]);
        if (i < n - 1) i++;
      } else {
        variable3[k] = variable2[j];
        System.out.println("Insertando de variable2. j=" + j + " valor=" + variable2[j]);
        if (j < n - 1) j++;
      }
      k++;
    }

    //        for (int i=0; i<n -1; i++) {
    //            if (variable1[i] <= variable2[i]) {
    //                variable3[i] = variable1[i];
    //            }
    //            else {
    //                variable3[i] = variable2[i];
    //            }
    //        }

    //        for (i=0; i<12; i++) {
    //            System.out.println(variable3[i]);
    //        }

    System.out.println(Arrays.toString(variable3));
  }
}
