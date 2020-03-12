package alixar.u7.t3.a3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class principal {
    public static void main(String [] args) {
        Map<Integer, String> mapa1 = new HashMap<>();
        mapa1.put(codigo("12345954"),"Juan Pérez Marcos");
        mapa1.put(codigo("64218481"),"Paco Pepe Gómez Sánchez");
        mapa1.put(codigo("25419632"),"Pedro Espino López");
        mapa1.put(codigo("47952145"),"Manolo García Gutiérrez");
        mapa1.put(codigo("12478953"),"Ernesto Varela Ramírez");
        recorreMapa(mapa1);

    }
    public static int codigo (String dni) {
        int sumaDNI = 0;
        for (int i = 0; i < dni.length(); i++) {
            char letra = dni.charAt(i);
            int numEntero = Integer.parseInt(String.valueOf(letra));
            sumaDNI = sumaDNI + numEntero;
        }
        return sumaDNI;
    }
    public static void recorreMapa(Map mapa1) {
        Iterator it = mapa1.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("La clave: " + key + " está asociada al nombre: " + mapa1.get(key));
        }
    }
}
