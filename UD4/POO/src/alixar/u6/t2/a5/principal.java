package alixar.u6.t2.a5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class principal {
    public static void main(String[] args) {
        final String fichero = "tablaDouble.dat";
        try{
            FileInputStream archivo = new FileInputStream(fichero);
            ObjectInputStream in = new ObjectInputStream(archivo);

            double [] t = (double []) in.readObject();
            System.out.println(Arrays.toString(t));
            in.close();
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }
}

