package com.company;
import java.util.Scanner;
public class ej3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        int numero = scanner.nextInt();
        String binario = "";

        if (numero == 0) {
            binario = "0";
        }

        while (numero > 0) {
            if (numero % 2 == 0) {
                binario = "0" + binario;
            } else {
                binario = "1" + binario;
            }
            numero = numero / 2;
        }

        System.out.println("El número convertido a binario es: " + binario);

    }

}