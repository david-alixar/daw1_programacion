package alixar.u6.t2.a6;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class principal {
    public static void main(String[] args) {
        final String fichero = "double.dat";
        try{
            FileInputStream archivo = new FileInputStream(fichero);
            ObjectInputStream in = new ObjectInputStream(archivo);

            try{
                while (true){
                    System.out.println(in.readDouble());
                }
            } catch (EOFException ex) {
                System.out.println("Fin del fichero");
            }
            in.close();
        }
        catch (IOException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }
}
