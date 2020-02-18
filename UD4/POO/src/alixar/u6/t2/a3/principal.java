package alixar.u6.t2.a3;

import java.io.*;
import java.util.Scanner;

public class principal {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca un número entero para introducirlo en el fichero: ");
            int numero  = teclado.nextInt();
            final String fichero = "enteros.dat";

            try{
                FileOutputStream archivo = new FileOutputStream(fichero);
                ObjectOutputStream out = new ObjectOutputStream(archivo);
                while (numero >= 0) {
                    out.writeInt(numero);
                    System.out.println("Introduzca otro número entero positivo, negativo para salir: ");
                    numero = teclado.nextInt();
                }
                out.close();
                FileInputStream archivo2 = new FileInputStream(fichero);
                ObjectInputStream in = new ObjectInputStream(archivo2);

                try{
                    while (true){
                        System.out.println(in.readInt());
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
