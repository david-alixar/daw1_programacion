package alixar.u6.t1.a1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final String FICHERO_POR_DEFECTO = "prueba.txt";

        System.out.println("Escriba el nombre del fichero (prueba.txt por defecto)");
        String nombre_fichero = teclado.nextLine();
        if (nombre_fichero.isEmpty()) {
            nombre_fichero = FICHERO_POR_DEFECTO;
        }

        try {
            BufferedReader f = new BufferedReader(new FileReader(nombre_fichero));
            int c = f.read();
            while (c != -1) {
                System.out.print((char) c);
                c = f.read();
            }
            f.close();
        } catch (IOException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }
}
