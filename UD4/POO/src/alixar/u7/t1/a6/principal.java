package alixar.u7.t1.a6;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una serie de nombres. Presionar intro después de cada uno. Usar fin para salir:");
        String nombre = teclado.nextLine();
        String salida = "fin";
        Set<String> nombres = new LinkedHashSet<>();
        while (!nombre.equalsIgnoreCase(salida)){
            nombres.add(nombre);
            nombre = teclado.nextLine();
        }

        System.out.println(nombres);
    }
}
