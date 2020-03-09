package alixar.u7.t1.a4;

import java.util.*;
import java.util.stream.Collectors;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una serie de palabras separadas por espacios:");
        String frase = teclado.nextLine();
        List<String> lista1 = new ArrayList<String>();
        String[] s = frase.split(" ");

        List<String> lista_palabras_total = new ArrayList<String>();
        lista_palabras_total.addAll(Arrays.asList(s));
        List<String> lista_temporal = new ArrayList<>(lista_palabras_total);

        Set<String> palabras_repetidas = new LinkedHashSet<>();
            while (lista_temporal.size() > 0) {
                String temp = lista_temporal.remove(0);
                if (lista_temporal.contains(temp)) {
                    palabras_repetidas.add(temp);
                }
            }
         System.out.println("Palabras repetidas: \n" + palabras_repetidas);

         lista_temporal = new ArrayList<>(lista_palabras_total);
         lista_temporal.removeAll(palabras_repetidas);

        System.out.println("Palabras no repetidas: \n" + lista_temporal);
    }
}
