package Entrega_7_feb;

import java.util.Arrays;
import java.util.Comparator;

public class principal {
    public static void main(String[] args) {
        Terrestre t1 = new Coche("8459CLM",2003,Color.Rojo,"rojito 1");
        Terrestre t2 = new Motocicleta("7345KGB", 2018, Color.Amarillo,"amarillita 1");
        Terrestre t3 = new Coche("4459DLM",2005,Color.Verde,"verdecito");
        Terrestre t4 = new Coche("3459HML",2013,Color.Rojo,"rojito 2");
        Terrestre t5 = new Motocicleta("9345GGB", 2009, Color.Amarillo, "amarillita 2");
        Terrestre t6 = new Motocicleta("0345BBX", 2000, Color.Azul, "azulita");
        Terrestre t7 = new Coche("8459CLM",2003,Color.Rojo,"rojito 1");
        Aereo a1 = new Helicoptero("UP-A310I",1500,"mi helicopterito");
        Aereo a2 = new Avioneta("UP-A390H",1915,"mi avionetita");

        Terrestre [] terrestres = new Terrestre[6];
        terrestres[0] = t1;
        terrestres[1] = t2;
        terrestres[2] = t3;
        terrestres[3] = t4;
        terrestres[4] = t5;
        terrestres[5] = t6;

        System.out.println("Array terrestres ordenado por matrícula: ");
        Arrays.sort(terrestres);
        for (int i=0; i< 6; i++){
            System.out.println(terrestres[i]);
        }

        System.out.println(a2);
        System.out.println(a1.volar());
        a1.transportar(9);
        System.out.println(a1);

        System.out.println("Array terrestres ordenado por año de fabricación: ");
        Arrays.sort(
                terrestres,
                new Comparator(){
                    public int compare(Object obj1, Object obj2) {
                        int resultado = 0;
                        Terrestre t1 = (Terrestre) obj1;
                        Terrestre t2 = (Terrestre) obj2;
                        if (t1.getAno_fab() < t2.getAno_fab()) {
                            resultado = -1;
                        }
                        else if (t1.getAno_fab() > t2.getAno_fab()) {
                            resultado = 1;
                        }
                        return resultado;
                    }
                });

        for (int i=0; i< 6; i++){
            System.out.println(terrestres[i]);
        }

        if (t1.equals(t7)){
            System.out.println("Las matrículas son iguales");
        }
        else {
            System.out.println("Las matrículas son diferentes");
        }
    }
}
