package alixar.u7.t2.a13;

import java.util.ArrayList;
import java.util.List;

public class principal {
    public static void main(String [] args) {
        List<Integer> lista1 = new ArrayList<Integer>();
        List<Integer> lista2 = new ArrayList<Integer>();
        lista1.add(2);
        lista1.add(12);
        lista1.add(22);
        lista1.add(7);
        lista1.add(8);
        lista2.add(2);
        lista2.add(5);
        lista2.add(8);
        lista2.add(16);
        lista2.add(42);
        lista1.sort(new comparaEnteros());
        lista2.sort(new comparaEnteros());

    }

    List ordena (List lista1, List lista2){
        List<Integer> listaFinal = new ArrayList<Integer>(lista1);
        listaFinal.addAll(lista2);
        listaFinal.sort(new comparaEnteros());
        return listaFinal;
    }
}
