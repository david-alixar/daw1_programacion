package alixar.u7.t5.a1;

import java.util.Comparator;

public class OrdenaAlfabetico implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s1.compareTo(s2);
    }
}