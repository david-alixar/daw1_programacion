package alixar.u6.t2.a4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número entero para indicar la cantidad de números a introducir: ");
        int n  = teclado.nextInt();
        double [] tabla = new double [n];
        final String fichero = "tablaDouble.dat";
        System.out.println("Introduzca " + n + " números de tipo double seguidos: ");
        for (int i = 0; i< n; i++){
            tabla[i] = teclado.nextDouble();
        }
        try{
            FileOutputStream archivo = new FileOutputStream(fichero);
            ObjectOutputStream out = new ObjectOutputStream(archivo);

            out.writeObject(tabla);
            out.close();
        }
        catch (IOException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }
}
