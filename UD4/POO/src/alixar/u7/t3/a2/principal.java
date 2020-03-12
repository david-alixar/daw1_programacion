package alixar.u7.t3.a2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class principal {
    public static void main(String [] args) {
        Map<Integer, String> mapa1 = new HashMap<>();
        Scanner teclado = new Scanner(System.in);
        String dni = "46221877";
        String nombre;

        while (!dni.equals("0")) {
            System.out.println("Introduzca un dni (sin letra) y un nombre. 0 para salir:");
            dni = teclado.nextLine();
            if(dni.equals("0")){
                break;
            }
            nombre = teclado.nextLine();
            mapa1.put(codigo(dni),nombre);
        }
        System.out.println(mapa1);

        System.out.println("introduza un dni (sin letra) para calcular. Si existe se mostrará la clave y el valor");
        dni = teclado.nextLine();
        System.out.println(mapa1.get(codigo(dni)));
    }

    public static int codigo (String dni) {
        int sumaDNI = 0;
        for (int i = 0; i < dni.length(); i++) {
            char letra = dni.charAt(i);
            int numEntero = Integer.parseInt(String.valueOf(letra));
            sumaDNI = sumaDNI + numEntero;
        }
        return sumaDNI;
    }
}
