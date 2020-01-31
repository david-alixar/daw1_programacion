package alixar.u5.t3.a1;

import java.util.Arrays;
import java.util.Comparator;

public class principal {
    public static void main(String[] args) {
        int cant = 20;
        Integer array [] = new Integer[cant];
        for (int i= 0; i< cant; i++){
            array[i] = (int)(Math.random()*100+1);
        }
        Arrays.sort(
                array,
                new Comparator(){
                    public int compare(Object obj1, Object obj2) {
                        int resultado = 0;
                        Integer i1 = (Integer) obj1;
                        Integer i2 = (Integer) obj2;
                        return - (i1.compareTo(i2));
                    }
                });
        for (int i= 0; i< cant; i++){
            System.out.println(array[i]);
        }
    }
}
