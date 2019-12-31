package alixar.u4.t2.a2;

import java.util.Stack;

public class Pila {
    // Atributos
    private Stack pila;
    // Metodos
    public Pila () {
        pila = new Stack();
    }
    public void apilar (int cant) {
        for (int i = 1; i <= cant; i++) {
            pila.push(Integer.toString(i));
        }
    }
    public void desapilar () {
        while (!pila.empty())
            System.out.println(pila.pop());
    }
}
