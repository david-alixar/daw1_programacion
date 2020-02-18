package alixar.u6.t1.a4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class principal {
    public static void main(String[] args) {
    final String nombre_fichero = "carta.txt";
    char caracter=0;
    int contador_caracteres = 0;
    int contador_lineas = 0;
    int contador_palabras = 0;
    char salto_linea ='\n';
    char en_blanco=' ';

    try {
        BufferedReader f = new BufferedReader(new FileReader(nombre_fichero));
        int c = f.read();
        while (c != -1) {
            c = f.read();
            caracter =  (char) c;
            contador_caracteres ++;
            if (caracter == en_blanco){
                contador_palabras++;
            }
            if (caracter==salto_linea){
                contador_lineas++;
                contador_palabras++;
            }
        }
        if (caracter!=salto_linea){
            contador_lineas++;
            contador_palabras++;
        }
        f.close();

        System.out.println("Caracteres: " + contador_caracteres);
        System.out.println("Palabras: " + contador_palabras);
        System.out.println("Líneas: " + contador_lineas);
    } catch (
    IOException e) {
        System.out.println("¡Error al abrir el fichero!");
    }
}
}
