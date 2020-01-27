package alixar.u5.t2.a1;

public class PilaTabla implements Pila{

    //Atributos
    private Integer [] pila;
    private int contador = 0;

    public PilaTabla(){
        pila = new Integer [10];
    }
    //Métodos
    public void apilar(Integer numero){
            pila[contador] = numero;
            contador++;
    }
    public Integer desapilar(){
        Integer desapilado;
        contador--;
        desapilado = pila[contador];
        return desapilado;
    }
}
