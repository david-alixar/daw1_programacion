package alixar.u6.t2.a9;


import java.io.*;

public class principal {
    public static void main(String[] args) {
        Mecanicos m1 = new Mecanicos("Manolo López", "954365789", Especialidad.Frenos);
        Mecanicos m2 = new Mecanicos("Eulalio Pérez", "955784235", Especialidad.Hidraulica);
        Maquinistas maq1 = new Maquinistas("Ernesto Marcos", "78452145K", 1200, "maquinista");
        Maquinistas maq2 = new Maquinistas("Mario García", "77478148W", 1200, "maquinista");
        Locomotoras l1 = new Locomotoras("4567FLH", 5000,2007,m1);
        Locomotoras l2 = new Locomotoras("4567HLH", 4000,2013,m2);
        Trenes t1 = new Trenes(l1,maq1);
        Trenes t2 = new Trenes (l2,maq2);
        Trenes t3 = new Trenes (l1,maq2);
        Trenes t4 = new Trenes (l2,maq1);

        final String fichero = "trenes.dat";

        try{
            FileOutputStream archivo = new FileOutputStream(fichero);
            ObjectOutputStream out = new ObjectOutputStream(archivo);

            out.writeObject(t1);
            out.close();
        }
        catch (IOException e) {
            System.out.println("¡Error al abrir el fichero!");
        }


        try{
            FileInputStream archivo2 = new FileInputStream(fichero);
            ObjectInputStream in = new ObjectInputStream(archivo2);

            Trenes s = (Trenes) in.readObject();
            System.out.println(s);
            in.close();
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("¡Error al abrir el fichero!");
        }


    }
}
