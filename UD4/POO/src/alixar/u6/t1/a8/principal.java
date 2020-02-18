package alixar.u6.t1.a8;

import java.io.*;

public class principal {
    public static void main(String[] args) {
        final String nombre_fichero1 = "perso1.txt";
        final String nombre_fichero2 = "perso2.txt";
        final String fichero_final = "todos.txt";

            try {
                BufferedReader fichero1 = new BufferedReader(new FileReader(nombre_fichero1));
                BufferedReader fichero2 = new BufferedReader(new FileReader(nombre_fichero2));
                BufferedWriter f_final = new BufferedWriter(new FileWriter(fichero_final));
                String linea_fichero1 = fichero1.readLine();
                String linea_fichero2 = fichero2.readLine();
                while (linea_fichero2 != null && linea_fichero1!= null) {
                    if (linea_fichero1.compareToIgnoreCase(linea_fichero2) <0){
                        f_final.write(linea_fichero1);
                        f_final.newLine();
                        linea_fichero1= fichero1.readLine();
                    }
                    else {
                        f_final.write(linea_fichero2);
                        f_final.newLine();
                        linea_fichero2= fichero2.readLine();
                    }
                }
                if (linea_fichero1 == null){
                    while (linea_fichero2!= null){
                        f_final.write(linea_fichero2);
                        f_final.newLine();
                        linea_fichero2 = fichero2.readLine();
                    }
                }

                if (linea_fichero2 == null){
                    while (linea_fichero1!= null){
                        f_final.write(linea_fichero1);
                        f_final.newLine();
                        linea_fichero1 = fichero1.readLine();
                    }
                }
                fichero1.close();
                fichero2.close();
                f_final.close();

            } catch (IOException e) {
                System.out.println("¡Error al abrir el fichero!");
            }

    }
}
