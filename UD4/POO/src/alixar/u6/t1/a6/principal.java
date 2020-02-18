package alixar.u6.t1.a6;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class principal {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            final String nombre_fichero = "firmas.txt";
            System.out.println("Escoja 1 si desea ver el libro de firmas o 2 si desea editarlo:");
            int elige = 0;
            try {
                elige = teclado.nextInt();
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Donde va bruto!!!");
            }
            String nombre;

            if (elige == 1) {
                try {
                    BufferedReader f = new BufferedReader(new FileReader(nombre_fichero));
                    String c = f.readLine();
                    while (c != null) {
                        System.out.println(c);
                        c = f.readLine();
                    }
                    f.close();

                } catch (IOException e) {
                    System.out.println("¡Error al abrir el fichero!");
                }
            }
            if (elige == 2){
                try {
                    System.out.println("Introduzca su nombre para firmar el libro, se comprobará que no esté repetido:");
                    nombre = teclado.nextLine();
                    BufferedReader f = new BufferedReader(new FileReader(nombre_fichero));
                    BufferedWriter g = new BufferedWriter(new FileWriter(nombre_fichero, true));
                    String c = f.readLine();
                    boolean existe = false;
                    while (c != null) {
                        if (c.equalsIgnoreCase(nombre)){
                            existe = true;
                            break;
                        }
                        c = f.readLine();
                    }
                    if (existe){
                        System.out.println("No se ha podido añadir el registro porque ya existe.");
                    }
                    else {
                        g.newLine();
                        g.write(nombre);
                    }
                    f.close();
                    g.close();

                } catch (IOException e) {
                    System.out.println("¡Error al abrir el fichero!");
                }
            }
        }
        }

