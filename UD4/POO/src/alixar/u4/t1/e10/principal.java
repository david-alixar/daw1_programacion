package alixar.u4.t1.e10;

import java.util.Scanner;

public class principal
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una hora (primero la hora y después los minutos): ");
        int hora = teclado.nextInt();
        int minuto = teclado.nextInt();
        System.out.println("Introduzca unos segundos para sumarlos a la hora original");
        int n = teclado.nextInt();
        Hora h1 = new Hora(hora, minuto);
        h1.get();
        h1.set(n);
        h1.get();

    }
}
