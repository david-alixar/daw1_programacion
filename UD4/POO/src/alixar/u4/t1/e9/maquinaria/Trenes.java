package alixar.u4.t1.e9.maquinaria;

import alixar.u4.t1.e9.personal.Maquinistas;

import java.util.Arrays;

public class Trenes {
    // Atributos
    private Locomotoras locomotora;
    private Vagones [] vagon = new Vagones [5];
    private Maquinistas maquinista;
    private int cant_vagones = 0;

    // Metodos
    public Trenes (Locomotoras locomotora, Maquinistas maquinista) {
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
}
