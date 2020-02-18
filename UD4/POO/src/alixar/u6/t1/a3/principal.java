package alixar.u6.t1.a3;


import java.io.*;

public class principal {
    public static void main(String[] args) {
        final String FICHERO_POR_DEFECTO = "original.txt";
        final String FICHERO_FINAL = "copia.txt";

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
