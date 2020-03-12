package alixar.u7.t2.a14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una cadena de texto: ");
        String cadena = teclado.nextLine();
        System.out.println(leeCadena(cadena));
    }
    public static List<Character> leeCadena(String cadena){
        List<Character> lista1 = new ArrayList<>();
        for (int i=0; i< cadena.length(); i++){
            char letra = cadena.charAt(i);
            lista1.add(letra);
        }

        return lista1;
    }
}
