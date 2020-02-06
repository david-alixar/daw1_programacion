package alixar.u5.t3.a4;

import java.util.Arrays;

public class Conjunto {

    //Atributos
    private Integer [] conjunto;
    private int contador = 0;
    private int cantidad;

    //Constructores
    public Conjunto() {
        cantidad = 10;
        conjunto = new Integer[cantidad];
    }
    public Conjunto(int cantidad){
        this.cantidad = cantidad;
        conjunto = new Integer[cantidad];
    }

    //Métodos
    public int cant_elementos (){
        return contador;
    }

    public void insertarNum (int numero){
        if (contador >= conjunto.length){
            conjunto = Arrays.copyOf(conjunto, conjunto.length + 1);
        }
        for (int i = 0; i < contador; i++) {
            if (numero == conjunto[i]) {
                return;
            }
        }
        conjunto[contador++] = numero;
    }

    public void eliminarNum (int numero){
        boolean encontrado = false;
        for (int i = 0; i < contador-1; i++){
            if (numero == conjunto[i]){
                encontrado = true;
            }
            if (encontrado) {
                conjunto[i] = conjunto[i + 1];
            }
        }
        conjunto[--contador] = null;
    }

    public boolean pertenece (int numero){
        boolean pertenece = false;
        for (int i = 0; i < contador; i++){
            if (numero == conjunto[i]){
                pertenece = true;
                break;
            }
        }
        return pertenece;
    }
    public int getContador(){
        return contador;
    }
    public void anadir_conjunto (Conjunto con){
        for (int i = 0; i< con.getContador(); i++){
            this.insertarNum(con.conjunto[i]);
        }
    }

    public void eliminar_del_conjunto (Conjunto con){
        for (int i = 0; i< con.getContador(); i++){
            for (int j = 0; j < contador; j++) {
                if (con.conjunto[i] == conjunto[j]) {
                    this.eliminarNum(conjunto[j]);
                }

            }
        }
    }

    public void mostrar_conjunto(){

        System.out.println(Arrays.toString(conjunto));
    }
 public static boolean incluido (Conjunto c1, Conjunto c2){
        boolean incluido = false;
        int contador = 0;
        for (int i = 0; i< c1.getContador(); i++){
            for (int j = 0; j< c2.getContador(); j++){
                if (c1.conjunto[i].equals(c2.conjunto[j])){
                    contador++;
                }
            }
        }
        if (contador == c1.getContador()){
            incluido = true;
        }
        return incluido;
 }
 public static Conjunto union (Conjunto c1, Conjunto c2){
        int fin_conjunto = c1.getContador()+c2.getContador();
        Conjunto nuevo_conjunto = new Conjunto(fin_conjunto);
        nuevo_conjunto.anadir_conjunto(c1);
        nuevo_conjunto.anadir_conjunto(c2);
        return nuevo_conjunto;
 }
 public static Conjunto interseccion(Conjunto c1, Conjunto c2){
     Conjunto nuevo_conjunto = new Conjunto();
        for (int i = 0; i< c1.getContador(); i++){
            if (c2.pertenece(c1.conjunto[i])){
                nuevo_conjunto.insertarNum(c1.conjunto[i]);
            }
        }
        return nuevo_conjunto;
 }
 public static Conjunto diferencia(Conjunto c1, Conjunto c2){
        Conjunto nuevo_conjunto = new Conjunto();
     for (int i = 0; i< c1.getContador(); i++){
         if (!c2.pertenece(c1.conjunto[i])){
             nuevo_conjunto.insertarNum(c1.conjunto[i]);
         }
     }
        return nuevo_conjunto;
    }
}
