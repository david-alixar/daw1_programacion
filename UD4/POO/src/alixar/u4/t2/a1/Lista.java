package alixar.u4.t2.a1;

import java.util.ArrayList;

public class Lista {
    // Atributos
    private ArrayList<Integer> lista ;
    // Metodos
    public Lista () {
        lista = new ArrayList<Integer>(10);
    }

    public Lista (int tam_inc){
        lista = new ArrayList<Integer>(tam_inc);
    }
    public int num_elem () {
        int cant = lista.size();
        return cant;
    }
    public void anadir_elem (Integer anadir) {
        lista.add(anadir);
    }
    public void anadir_inicio (Integer anadir) {
        lista.add(0, anadir);
    }
    public void anadir_final (Integer anadir) {
        int fin = lista.size();
        lista.add(fin, anadir);
    }
    public void anadir_lista () {
        lista.addAll(lista);
    }
    public void anadir_posicion (int posicion, Integer anadir) {
        int fin = lista.size();
        if (posicion <= fin) {
            lista.add(posicion, anadir);
        }
        else {
            while (fin < posicion) {
                lista.add(fin, 0);
                fin ++;
            }
            lista.add(posicion, anadir);
        }
    }
    public void eliminar_elemento (int posicion){
        lista.remove(posicion);
    }
    public int buscar_num (int busqueda){
        int posicion = lista.indexOf(busqueda);
        return posicion;
    }
    public Integer devolver_elem (int dev) {
        Integer devuelto = lista.get(dev);
        return devuelto;
    }
    public String devolver_lista (){
        int fin = lista.size();
        String cadena = "";
        for (int i = 0; i <fin; i++){
            cadena = cadena + lista.get(i);
        }
        return cadena;
    }

    public String desapilar_lista (){
        int fin = lista.size();
        String cadena ="";
        for (int i = fin -1; i >= 0; i--){
            cadena = cadena + lista.get(i);
        }
        return cadena;
    }
}
