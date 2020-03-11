package alixar.u7.t1.a8;

import java.util.*;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una serie de nombres separados por espacios:");
        String frase = teclado.nextLine();
        List<String> lista1 = new ArrayList<String>();
        String[] s = frase.split(" ");
        lista1.addAll(Arrays.asList(s));
        System.out.println(lista1);
        System.out.println(eliminaRepetidos(lista1));
    }

        public static List eliminaRepetidos (List lista1){
            Set<String> palabras_repetidas = new LinkedHashSet<>(lista1);
            List<String> lista_final = new ArrayList<>(palabras_repetidas);
            return lista_final;
        }
}
