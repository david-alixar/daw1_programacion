package alixar.u5.t2.a2;

import java.util.Arrays;
import java.util.Comparator;

public class principal {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("47896542n", "Pedro", 50, 500);
        Cliente c2 = new Cliente("47895478h", "Angustias", 70, 5000);
        Cliente c3 = new Cliente("47896542n", "Manuel", 30, 350);
        Cliente c4 = new Cliente("36895478g", "Zacarías", 26, 5500);
        Cliente c5 = new Cliente("47235478w", "Eulalio", 65, 9000);
        Cliente [] clientes = new Cliente[5];
        clientes[0] = c1;
        clientes[1] = c2;
        clientes[2] = c3;
        clientes[3] = c4;
        clientes[4] = c5;
        if (c1.equals(c2)){
            System.out.println("Los DNI son iguales");
        }
        else {
            System.out.println("Los DNI son diferentes");
        }
        if (c1.equals(c3)){
            System.out.println("Los DNI son iguales");
        }
        else {
            System.out.println("Los DNI son diferentes");
        }

        System.out.println("Imprimimos el array ordenado por el DNI:");
        Arrays.sort(clientes);

        for (int i = 0; i < 5; i++){
            System.out.println(clientes[i]);
        }

        System.out.println("Imprimimos el array ordenado por el nombre:");

        Arrays.sort(
                clientes,
                new Comparator(){
                    public int compare(Object obj1, Object obj2) {
                        Cliente c1 = (Cliente) obj1;
                        Cliente c2 = (Cliente) obj2;
                        return c1.getNombre().compareTo(c2.getNombre());
                    }
                });
        for (int i = 0; i < 5; i++){
            System.out.println(clientes[i]);
        }

        System.out.println("Imprimimos el array ordenado por la edad:");

        Arrays.sort(
                clientes,
                new Comparator(){
                    public int compare(Object obj1, Object obj2) {
                        int resultado = 0;
                        Cliente c1 = (Cliente) obj1;
                        Cliente c2 = (Cliente) obj2;
                        if (c1.getEdad() < c2.getEdad()) {
                            resultado = -1;
                        }
                        else if (c1.getEdad() > c2.getEdad()) {
                            resultado = 1;
                        }
                        return resultado;
                    }
                });
        for (int i = 0; i < 5; i++){
            System.out.println(clientes[i]);
        }
    }
}
