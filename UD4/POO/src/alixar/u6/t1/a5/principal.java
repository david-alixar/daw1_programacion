package alixar.u6.t1.a5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class principal {
    public static void main(String[] args) {
        final String nombre_fichero = "numeros.txt";
        int menor = -1;
        int mayor = 0;
        int numero = 0;

        try {
            BufferedReader f = new BufferedReader(new FileReader(nombre_fichero));
            String c = f.readLine();
            numero = Integer.valueOf(c);
            menor =  numero;
            mayor =  numero;
            while (c != null) {
                numero = Integer.valueOf(c);
                if (numero < menor){
                    menor = numero;
                }
                if (numero > mayor){
                    mayor = numero;
                }
                c = f.readLine();
            }
            f.close();

            System.out.println("El menor es: " + menor);
            System.out.println("El mayor es: " + mayor);
        } catch (IOException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }
}
