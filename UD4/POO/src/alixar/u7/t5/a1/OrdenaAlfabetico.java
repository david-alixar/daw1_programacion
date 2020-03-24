package alixar.u7.t5.a1;

import java.util.Comparator;

public class OrdenaAlfabetico implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Aspirante s1 = (Aspirante) o1;
        Aspirante s2 = (Aspirante) o2;
        return s1.getNombre().compareTo(s2.getNombre());
    }
}