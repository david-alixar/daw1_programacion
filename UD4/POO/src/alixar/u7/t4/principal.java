package alixar.u7.t4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class principal {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, Empleado> mapa1 = new HashMap<>();
        System.out.println("Introduzca en este orden: dni, nombre, edad, estatura y sueldo. ");
        String dni = teclado.nextLine();
        teclado.nextLine();
        String nombre = teclado.nextLine();
        teclado.nextLine();
        int edad = teclado.nextInt();
        teclado.nextLine();
        double estatura = teclado.nextDouble();
        teclado.nextLine();
        int sueldo = teclado.nextInt();
        //teclado.nextLine();

        while (!dni.equals("0")) {
            mapa1.put(dni,new Empleado(dni,nombre,edad,estatura,sueldo));
            System.out.println("Introduzca en este orden: dni, nombre, edad, estatura y sueldo. 0 para salir");
            dni = teclado.nextLine();
            teclado.nextLine();
            if(dni.equals("0")){
                break;
            }
            nombre = teclado.nextLine();
            teclado.nextLine();
            edad = teclado.nextInt();
            teclado.nextLine();
            estatura = teclado.nextDouble();
            teclado.nextLine();
            sueldo = teclado.nextInt();
            teclado.nextLine();
        }
        System.out.println(mapa1);
    }
}
