package alixar.u7.t2.a16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class Traductor {

    //Atributos
    Map<String, String> diccionario;

    //Contrsuctor

    public Traductor (){
        diccionario = new HashMap<>();
        try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("diccionario.dat"))) {
            diccionario = (Map<String, String>) fichero.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String traduce (String palabra){
        String devuelto;
        if (diccionario.containsKey(palabra)) {
            devuelto = diccionario.get(palabra);
        }
        else{
            devuelto = "La palabra no existe en el diccionario o no se ha escrito correctamente";
        }
        return devuelto;
    }
}
