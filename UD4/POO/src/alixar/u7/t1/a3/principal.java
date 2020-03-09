package alixar.u7.t1.a3;

import java.util.*;

public class principal {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();

        while (lista1.size() < 20) {
            int num = (int) (Math.random() * 11 + 0);
            System.out.println(num);
            lista1.add(num);
        }


        System.out.println("Lista ordenada decrecientemente: \n" + lista1);
    }
}
