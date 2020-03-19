package alixar.u7.t5.a1;

import java.io.Serializable;
import java.util.*;

public class Aprobados implements Serializable {

    //Constructor
    public Aprobados(){

    }

    //Métodos
    public double calcularMedia (Integer aspirante, Map calificaciones){
        double media;
        Integer calificacionTotal = 0;
        List<Integer> lista1 = new ArrayList<Integer>((Integer) calificaciones.get(aspirante));
        Iterator it = lista1.iterator();
        while (it.hasNext()) {
            Integer calificacion = (Integer) it.next();
            calificacionTotal = calificacionTotal + calificacion;
        }
        media = calificacionTotal/lista1.size();
        return media;
    }
    public void generarInforme(Set aprobados){
        System.out.println("Nombre                  DNI  Calificación media\n\n------------------ --------  ------------------");
        System.out.println(aprobados);
    }
}
