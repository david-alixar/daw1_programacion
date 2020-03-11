package alixar.u7.t2.a9;

import java.util.LinkedHashSet;
import java.util.Set;

public class principal {
    public static void main(String[] args) {

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
        System.out.println(union(conjunto1, conjunto2));
    }
        static Set union (Set conjunto1, Set conjunto2){
            Set<Integer> conjuntoFinal = new LinkedHashSet<>(conjunto1);
            conjuntoFinal.addAll(conjunto2);
            return conjuntoFinal;
        }

}
