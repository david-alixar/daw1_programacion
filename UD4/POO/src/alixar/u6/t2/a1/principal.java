package alixar.u6.t2.a1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número de tipo double para introducirlo en el fichero: ");
        double numero = teclado.nextDouble();
        final String fichero = "double.dat";

        try{
            FileOutputStream archivo = new FileOutputStream(fichero);
            ObjectOutputStream out = new ObjectOutputStream(archivo);

             out.writeDouble(numero);
             out.close();
        }
        catch (IOException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }
}
