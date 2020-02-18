package alixar.u6.t1.a2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final String FICHERO_POR_DEFECTO = "datos.txt";

        System.out.println("Escriba su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Escriba su edad: ");
        String edad = teclado.nextLine();

        try {
            BufferedWriter f = new BufferedWriter(new FileWriter(FICHERO_POR_DEFECTO));
            f.write("Nombre: " + nombre);
            f.newLine();
            f.write("Edad: " + edad);

            f.close();
        } catch (IOException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }
}
