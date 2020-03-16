package alixar.u7.t2.a16;

import java.util.Scanner;

public class principal {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una palabra para buscarla en el diccionario: ");
        String palabra = teclado.nextLine();



        Traductor d1 = new Traductor();
        System.out.println(d1.traduce(palabra));

    }
}
