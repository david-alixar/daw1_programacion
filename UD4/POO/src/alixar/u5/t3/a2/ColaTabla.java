package alixar.u5.t3.a2;

public class ColaTabla {

    //Atributos
    private Integer [] cola;
    private int contador = 0;

    //Constructor
    public ColaTabla(){
        cola = new Integer [10];
    }

    //Métodos
    public void encolar(Integer numero){
            cola[contador] = numero;
            contador++;
    }
    public Integer desencolar(){
        Integer resultado = cola[0];
        for (int i = 0; i < contador -1; i++){
            cola[i] = cola[i+1];
        }
        contador--;
        return resultado;
    }
}
