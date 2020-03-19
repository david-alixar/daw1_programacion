package alixar.u7.t5.a1;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class CalificacionPruebas implements Serializable {

    //Constructor
    public CalificacionPruebas(){

    }

    //Métodos
    public void InsertaCalificacion(Integer id, List calificaciones, Map aspirantes){

        aspirantes.put(id,calificaciones);
    }
}
