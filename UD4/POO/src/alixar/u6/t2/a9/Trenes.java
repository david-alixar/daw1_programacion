package alixar.u6.t2.a9;

import alixar.u6.t2.a9.Locomotoras;
import alixar.u6.t2.a9.Vagones;
import alixar.u6.t2.a9.Maquinistas;

import java.io.Serializable;

public class Trenes implements Serializable {
    // Atributos
    private Locomotoras locomotora;
    private Vagones [] vagon = new Vagones [5];
    private Maquinistas maquinista;
    private int cant_vagones = 0;

    // Metodos
    public Trenes(Locomotoras locomotora, Maquinistas maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
    }
    public void anadir_vagon (double cap_max, double cap_act, String mercancia) {
        if (cant_vagones <= 5) {
            Vagones vag1 = new Vagones(cap_max, cap_act, mercancia);
            this.vagon[cant_vagones] = vag1;
            cant_vagones++;
        }
    }

    @Override
    public String toString() {
        String resumen = "El tren tiene los siguientes datos: " + locomotora + maquinista;
        return resumen;
    }
}
