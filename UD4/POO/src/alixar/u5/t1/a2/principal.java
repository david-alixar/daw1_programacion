package alixar.u5.t1.a2;

public class principal {
    public static void main(String[] args) {
        Hora12 h12_1 = new Hora12(18, 59, Meridiano.PM);
        System.out.println(h12_1);
        h12_1.setHora(19);
        System.out.println(h12_1);
        h12_1.inc();
        System.out.println(h12_1);
    }
}
