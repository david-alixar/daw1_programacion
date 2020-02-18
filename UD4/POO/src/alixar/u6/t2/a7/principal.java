package alixar.u6.t2.a7;

import java.io.*;

public class principal {
    public static void main(String[] args) {
        final String fichero = "frase.dat";
        String frase = "Hola dsds";

        try{
            FileOutputStream archivo = new FileOutputStream(fichero);
            ObjectOutputStream out = new ObjectOutputStream(archivo);

            out.writeObject(frase);
            out.close();
        }
        catch (IOException e) {
            System.out.println("¡Error al abrir el fichero!");
        }

        try{
            FileInputStream archivo2 = new FileInputStream(fichero);
            ObjectInputStream in = new ObjectInputStream(archivo2);

            String s = (String) in.readObject();
            System.out.println(s);
            in.close();
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }
}
