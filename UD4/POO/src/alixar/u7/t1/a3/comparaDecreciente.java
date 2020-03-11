package alixar.u7.t1.a3;

import java.util.Comparator;

public class comparaDecreciente implements Comparator {
     @Override
    public int compare(Object o1, Object o2) {
        return (Integer) o2 - (Integer) o1;
    }

}
