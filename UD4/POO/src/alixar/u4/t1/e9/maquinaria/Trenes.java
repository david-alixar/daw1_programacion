package alixar.u4.t1.e9.maquinaria;

import alixar.u4.t1.e9.personal.Maquinistas;

public class Trenes {
    // Atributos
    private Locomotoras locomotora;
    private Vagones [] vagon;
    private Maquinistas maquinista;

    // Metodos
    public Trenes (Locomotoras locomotora, Maquinistas maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
    }
    public void anadir_vagon (Vagones vagon) {
        this.vagon[1] = vagon;
    }
}
