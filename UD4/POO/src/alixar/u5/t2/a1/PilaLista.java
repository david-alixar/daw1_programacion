package alixar.u5.t2.a1;

import alixar.u4.t2.a1.Lista;

public class PilaLista implements Pila{

    //Atributos
    Lista lista;
    private int contador = 0;

    //Constructor
    public PilaLista(){
        lista = new Lista();
    }

    //Métodos
    public void apilar(Integer numero){
        lista.anadir_final(numero);
        contador++;
    }
    public Integer desapilar(){
        Integer desapilado;
        contador--;
        desapilado = lista.devolver_elem(contador);
        lista.eliminar_elemento(contador);
        return desapilado;
    }
}
