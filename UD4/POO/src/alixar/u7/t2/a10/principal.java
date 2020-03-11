package alixar.u7.t2.a10;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class principal {
    public static void main(String [] args){
        Set<Integer> conjunto1 = new LinkedHashSet<>();
        Set<Integer> conjunto2 = new LinkedHashSet<>();
        conjunto1.add(5);
        conjunto1.add(4);
        conjunto1.add(9);
        conjunto1.add(0);
        conjunto1.add(12);
        conjunto1.add(3);
        conjunto2.add(3);
        conjunto2.add(14);
        conjunto2.add(4);
        conjunto2.add(5);
        conjunto2.add(11);
        conjunto2.add(0);
        System.out.println(interseccion(conjunto1, conjunto2));

    }

    public static Set interseccion (Set conjunto1, Set conjunto2){
        Set conjuntoFinal = new LinkedHashSet<>();
        Iterator it = conjunto1.iterator();
        while (it.hasNext()) {
            Object temp = it.next();
            if (conjunto2.contains(temp)) {
                conjuntoFinal.add(temp);
            }
        }
        return conjuntoFinal;
    }
}
