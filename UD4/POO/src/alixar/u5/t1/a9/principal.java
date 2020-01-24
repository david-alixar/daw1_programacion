package alixar.u5.t1.a9;

import java.util.Arrays;
import java.util.Comparator;

public class principal {
    public static void main(String[] args) {
        Electrodomestico E1 = new Electrodomestico();
        System.out.println(E1);
        Electrodomestico E2 = new Electrodomestico(500, 100);
        System.out.println(E2);
        Lavadora l1 = new Lavadora(50,500,100,colores.blanco,consumo_energetico.A);
        l1.getPrecioFinal();
        System.out.println(l1);
        Lavadora l2 = new Lavadora();
        l2.getPrecioFinal();
        Lavadora l3 = new Lavadora(21,250, 150,colores.blanco,consumo_energetico.B);
        l3.getPrecioFinal();
        Television tele = new Television();
        System.out.println(tele);
        Television tele2 = new Television(60,true,500,20,colores.negro,consumo_energetico.A);
        System.out.println(tele2);
        Lavadora [] lavadoras = new Lavadora[3];
        lavadoras[0] = l1;
        lavadoras[1] = l2;
        lavadoras[2] = l3;
        System.out.println(Arrays.toString(lavadoras));
        Arrays.sort(lavadoras);
        System.out.println(Arrays.toString(lavadoras));
        Arrays.sort(
        lavadoras,
        new Comparator(){
            public int compare(Object obj1, Object obj2) {
                int resultado = 0;
                Lavadora l1 = (Lavadora) obj1;
                Lavadora l2 = (Lavadora) obj2;
                if (l1.getPrecioFinal() < l2.getPrecioFinal()) {
                    resultado = -1;
                }
                else if (l1.getPrecioFinal() > l2.getPrecioFinal()) {
                    resultado = 1;
                }
                return resultado;
        }
    });
        System.out.println(Arrays.toString(lavadoras));
        Electrodomestico [] almacen = new Electrodomestico[10];

        almacen[0] = E1;
        almacen[1] = l1;
        almacen[2] = E2;
        almacen[3] = l2;
        almacen[4] = tele;
        almacen[5] = l3;
        almacen[6] = l3;
        almacen[7] = new Lavadora ();
        almacen[8] = new Television();
        almacen[9] = new Television(200, 20);

        for (int i = 0; i< 10; i++){
            System.out.println(almacen[i]);
        }
}
    }
