package alixar.u6.t1.a3;

import java.io.*;
import java.util.Scanner;

public class principal2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca el nombre del fichero del que quiera realizar una copia");
        final String FICHERO_POR_DEFECTO = teclado.nextLine();
        final String FICHERO_FINAL = "copia_de_"+FICHERO_POR_DEFECTO;

        try {
            BufferedReader f = new BufferedReader(new FileReader(FICHERO_POR_DEFECTO));
            BufferedWriter g = new BufferedWriter(new FileWriter(FICHERO_FINAL));
            int c = f.read();
            while (c != -1) {
                g.write(c);
                c = f.read();
            }
            g.close();
            f.close();
        } catch (IOException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }
}
