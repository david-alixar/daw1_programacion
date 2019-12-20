package alixar.u4.t1.e9;

import alixar.u4.t1.e9.maquinaria.Locomotoras;
import alixar.u4.t1.e9.maquinaria.Trenes;
import alixar.u4.t1.e9.personal.Especialidad;
import alixar.u4.t1.e9.personal.Maquinistas;
import alixar.u4.t1.e9.personal.Mecanicos;
import alixar.u4.t1.e9.personal.JefesEstacion;

public class principal {
    public static void main(String[] args) {
        Maquinistas maq1 = new Maquinistas("Juan Fuentes", "76543456Y", 1200, "Empleado");
        Mecanicos mec1 = new Mecanicos("Jorge Varela", "955331966", Especialidad.Frenos);
        JefesEstacion je1 = new JefesEstacion("Ignacio Marcos" , "54789632L");
        Locomotoras loc1 = new Locomotoras ("7894 HLV", 6000, 2012,mec1);
        Trenes tren1 = new Trenes (loc1,maq1);
       // tren1.anadir_vagon(5000, 1200,"patatas");
    }

}
