package alixar.u6.t1.a7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final String nombre_fichero = "firmas.txt";
        char caracter=0;
        int contador_lineas = 0;
        char salto_linea ='\n';

        try {
            BufferedReader f = new BufferedReader(new FileReader(nombre_fichero));
            int c = f.read();
            while (c != -1) {
                caracter =  (char) c;
                System.out.print(caracter);
                if (caracter==salto_linea){
                    contador_lineas++;
                }
                if (contador_lineas == 3){
                    System.out.println("Introduzca un espacio para visionar las siguientes 3 líneas");
                    teclado.nextLine();
                    contador_lineas = 0;
                }
                c = f.read();
            }
            f.close();

        } catch (
                IOException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }
}
