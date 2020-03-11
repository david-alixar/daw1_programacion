package alixar.u7.t1.a5;

import alixar.u7.t1.a3.comparaDecreciente;

import java.util.Set;
import java.util.TreeSet;

public class principal {
    public static void main(String[] args) {
        Set<Integer> lista1 = new TreeSet<>( new comparaDecreciente());

        while (lista1.size() < 20) {
            int num = (int) (Math.random() * 101 + 0);
            lista1.add(num);
        }
        System.out.println("Lista ordenada decrecientemente: \n" + lista1);
    }
}
