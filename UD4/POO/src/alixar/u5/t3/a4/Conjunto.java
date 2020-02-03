package alixar.u5.t3.a4;

import java.util.Arrays;

public class Conjunto {

    //Atributos
    private Integer [] conjunto;
    private int contador = 0;

    //Constructores
    public Conjunto(){
        conjunto = new Integer[10];
    }
    public Conjunto(int cantidad){
        conjunto = new Integer[cantidad];
    }

    //Métodos
    public int cant_elementos (){
        return conjunto.length + 1;
    }
    public void insertarNum (int numero){
        boolean repetido = false;
        if (contador == 0){
            conjunto[0] = numero;
            contador++;
        }
        else {
            for (int i = 0; i < contador; i++) {
                if (numero == conjunto[i]) {
                    repetido = true;
                    break;
                }
                if (repetido = false) {
                    conjunto[contador] = numero;
                    contador++;
                }
            }
        }
    }

    public void eliminarNum (int numero){
        for (int i = 0; i <= contador; i++){
            if (numero == conjunto[i]){
                conjunto [i] = null;
                break;
            }
        }
    }

    public boolean pertenece (int numero){
        boolean pertenece = false;
        for (int i = 0; i <= contador; i++){
            if (numero == conjunto[i]){
                pertenece = true;
                break;
            }
        }
        return pertenece;
    }

    public void setConjunto(){
        System.out.println(Arrays.toString(conjunto));
    }
}
