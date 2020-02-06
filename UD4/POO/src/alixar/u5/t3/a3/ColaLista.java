package alixar.u5.t3.a3;

import alixar.u4.t2.a1.Lista;
import alixar.u5.t3.a6.Cola;

public class ColaLista implements Cola {

    //Atributos
    Lista lista;
    private int pos_inc = 0;

    //Constructor
    public ColaLista (){
        lista = new Lista();
    }

    //Métodos
    public void encolar(Integer numero){
        lista.anadir_final(numero);
    }
    public Integer desencolar(){
        Integer desencolado = lista.devolver_elem(pos_inc);
        lista.eliminar_elemento(pos_inc);
        return desencolado;
    }
}
