package alixar.u6.t2.a2;

import java.io.*;

public class principal {
    public static void main(String[] args) {
        final String fichero = "double.dat";
        try{
            FileInputStream archivo = new FileInputStream(fichero);
            ObjectInputStream in = new ObjectInputStream(archivo);

            System.out.println(in.readDouble());
            in.close();
        }
        catch (IOException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }
}
