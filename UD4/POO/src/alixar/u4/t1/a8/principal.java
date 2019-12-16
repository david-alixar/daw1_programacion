package alixar.u4.t1.a8;

public class principal {
    public static void main(String[] args) {
        InterruptorGeneral ig1 = new InterruptorGeneral();
        bombilla b1 = new bombilla(true, ig1, 1);
        bombilla b2 = new bombilla(false, ig1, 2);
        b1.estado_bombilla();
        ig1.general(false);
        b1.estado_bombilla();
        b1.apa_enc(true);
        b1.estado_bombilla();
        b2.estado_bombilla();
        b2.apa_enc(true);
        ig1.general(true);
        b2.apa_enc(true);
        b1.apa_enc(false);
        b1.estado_bombilla();
        b2.estado_bombilla();
    }
}
