package alixar.u6.t2.a8;

import java.io.*;
import java.util.Arrays;

public class principal {
    public static void main(String[] args) {
        int n = 50;
        int [] tabla = new int [n];
        int num;
        final String fichero = "tabla_enteros.dat";

        for (int i= 0; i< n; i++) {
            num = (int) (Math.random() * 101 + 0);
            tabla[i] = num;
        }
        Arrays.sort(tabla);
        try{
            FileOutputStream archivo = new FileOutputStream(fichero);
            ObjectOutputStream out = new ObjectOutputStream(archivo);

            out.writeObject(tabla);
            out.close();
        }
        catch (IOException e) {
            System.out.println("¡Error al abrir el fichero!");
        }

        try{
            FileInputStream archivo = new FileInputStream(fichero);
            ObjectInputStream in = new ObjectInputStream(archivo);

            int [] t = (int []) in.readObject();
            System.out.println(Arrays.toString(t));
            in.close();
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }
}
