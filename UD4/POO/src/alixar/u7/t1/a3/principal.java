package alixar.u7.t1.a3;

import java.util.*;

public class principal {
    public static void main(String[] args) {
        Set<Integer> lista1 = new TreeSet<>( new comparaDecreciente());

        for (int i=0; i<=20; i++) {
            int num = (int) (Math.random() * 101 + 0);
            lista1.add(num);
        }


        System.out.println("Lista ordenada decrecientemente: \n" + lista1);
    }
}
