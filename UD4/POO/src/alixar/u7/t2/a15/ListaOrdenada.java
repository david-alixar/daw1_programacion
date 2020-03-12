package alixar.u7.t2.a15;

import java.util.Comparator;
import java.util.LinkedList;

public class ListaOrdenada<E> extends LinkedList<E> {
    protected Comparator<E> comparador;

    public ListaOrdenada(Comparator<E> comparador) {
        super();
        this.comparador = comparador;
    }

    void insertarOrdenado(E elemento) {
        if (size() ==0){
            
        }
    }
}
