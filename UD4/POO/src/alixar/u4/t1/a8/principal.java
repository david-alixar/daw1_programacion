package alixar.u4.t1.a8;

public class principal {
    public static void main(String[] args) {
        Bombilla b1 = new Bombilla(true);
        InterruptorGeneral ig1 = new InterruptorGeneral();
        b1.estado_bombilla();
        //b1.apa_enc(false);
        b1.general(false);
        b1.estado_bombilla();
        b1.apa_enc(true);
        b1.general(true);
        b1.apa_enc(true);
        b1.estado_bombilla();
    }
}
