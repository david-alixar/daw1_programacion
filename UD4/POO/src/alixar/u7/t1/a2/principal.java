package alixar.u7.t1.a2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class principal {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<Integer>();

        for (int i= 0; i< 20; i++){
            int num = (int) (Math.random() * 101 + 0);
            lista1.add(num);
        }

        System.out.println(lista1);

        Collections.sort(lista1);
        Collections.reverse(lista1);

        System.out.println(lista1);
    }
}
