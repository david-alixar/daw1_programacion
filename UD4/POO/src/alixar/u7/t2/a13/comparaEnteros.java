package alixar.u7.t2.a13;

import java.util.Comparator;

public class comparaEnteros implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (Integer) o2 + (Integer) o1;
    }
}
