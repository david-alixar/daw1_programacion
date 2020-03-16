package alixar.u7.t4.a1;

import alixar.u7.t4.a1.Empleado;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class principal {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione: \n1) para introducir los datos de los empleados  \n2) para cargar el fichero");
        int selector = teclado.nextInt();
        teclado.nextLine();
        Map<String, Empleado> mapa1 = new HashMap<>();
        if (selector == 1) {
            System.out.println("Introduzca en este orden: dni, nombre, edad, estatura y sueldo. ");
            String dni = teclado.nextLine();
            String nombre = teclado.nextLine();
            int edad = teclado.nextInt();
            double estatura = teclado.nextDouble();
            int sueldo = teclado.nextInt();
            teclado.nextLine();

            while (!dni.equals("0")) {
                mapa1.put(dni, new Empleado(dni, nombre, edad, estatura, sueldo));
                System.out.println("Introduzca en este orden: dni, nombre, edad, estatura y sueldo. 0 para salir");
                dni = teclado.nextLine();
                if (dni.equals("0")) {
                    break;
                }
                nombre = teclado.nextLine();
                edad = teclado.nextInt();
                estatura = teclado.nextDouble();
                sueldo = teclado.nextInt();
                teclado.nextLine();
            }
        } else if (selector == 2) {
            carga_empleados(mapa1);
            System.out.println("El fichero empleados se ha cargado correctamente");
        }

        System.out.println("Menú\n Seleccione: 1) Visualizar estado en el mismo orden de introducción\n2) Borrar empleados\n 3) Visualizar empleado\n 4) Modificar empleado\n 5) Insertar empleados\n 6) Salir");
        int menu = teclado.nextInt();
        teclado.nextLine();
        while (menu != 6){
            switch (menu){
                case 1:
                    System.out.println(mapa1);
                    menu = teclado.nextInt();
                    teclado.nextLine();
                    break;
                case 2:
                    System.out.println("Introduzca el dni que desea borrar:");
                    String dniBorra = teclado.nextLine();
                    while (!dniBorra.equals("0")) {
                        borrarEmpleado(dniBorra, mapa1);
                        System.out.println("Introduzca otro dni para borrar (0 para salir):");
                        dniBorra = teclado.nextLine();
                    }
                    System.out.println(mapa1);
                    menu = teclado.nextInt();
                    teclado.nextLine();
                    break;
                case 3:
                    System.out.println("Introduzca el dni del empleado que desea obtener los datos:");
                    String dniEmple = teclado.nextLine();
                    visualizarEmpleado(dniEmple, mapa1);
                    System.out.println(mapa1);
                    menu = teclado.nextInt();
                    teclado.nextLine();
                    break;
                case 4:
                    System.out.println("Introduzca el dni del empleado que desea modificar:");
                    String dniModifica = teclado.nextLine();
                    System.out.println("Introduzca en el mismo orden: nombre, edad, estatura y sueldo");
                    String nombre = teclado.nextLine();
                    int edad = teclado.nextInt();
                    double estatura = teclado.nextDouble();
                    int sueldo = teclado.nextInt();
                    teclado.nextLine();
                    modificarEmpleado(dniModifica, mapa1, nombre, edad, estatura, sueldo);
                    System.out.println(mapa1);
                    menu = teclado.nextInt();
                    teclado.nextLine();
                    break;
                case 5:
                    System.out.println("Introduzca los datos del empleado que desea añadir en el siguiente orden: dni, nombre, edad, estatura y sueldo");
                    String dni = teclado.nextLine();
                    nombre = teclado.nextLine();
                    edad = teclado.nextInt();
                    estatura = teclado.nextDouble();
                    sueldo = teclado.nextInt();
                    teclado.nextLine();
                    insertarEmpleado(dni, mapa1, nombre, edad, estatura, sueldo);
                    System.out.println(mapa1);
                    menu = teclado.nextInt();
                    teclado.nextLine();
                    break;
            }
        }

        System.out.println("Hasta pronto!");
        //fin(mapa1);

    }

    public static Map carga_empleados (Map<String, Empleado> mapa1) {
        try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("empleados.dat"))) {
            mapa1 = (Map<String, Empleado>) fichero.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return mapa1;
    }
    public static void fin (Map<String, Empleado> mapa1){
        try (ObjectOutputStream fichero =
            new ObjectOutputStream(new FileOutputStream("empleados.dat"))) {
            fichero.writeObject(mapa1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void borrarEmpleado (String dni, Map mapa1){
        if(mapa1.containsKey(dni)){
            mapa1.remove(dni);
        }
        else {
            System.out.println("Error al intentar eliminar! El dni introducido no pertenece a ningún empleado!");
        }
    }

    public static void  visualizarEmpleado (String dni, Map mapa1){
        if(mapa1.containsKey(dni)){
            System.out.println(mapa1.get(dni));
        }
        else {
            System.out.println("El dni introducido no pertenece a ningún empleado! Revíselo e inténtelo de nuevo");
        }
    }

    public static void modificarEmpleado (String dni, Map mapa1, String nombre, int edad, double estatura, int sueldo){
        if(mapa1.containsKey(dni)){
            mapa1.put(dni, new Empleado(dni, nombre, edad, estatura, sueldo));
        }
        else {
            System.out.println("Error al intentar modificar al empleado! El dni introducido no pertenece a ningún empleado!");
        }
    }

    public static void insertarEmpleado (String dni, Map mapa1, String nombre, int edad, double estatura, int sueldo){
        if(mapa1.containsKey(dni)){
            System.out.println("Error! El empleado ya existe! Pruebe a modificarlo o elimínelo primero");
        }
        mapa1.put(dni, new Empleado(dni, nombre, edad, estatura, sueldo));
    }
}