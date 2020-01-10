package alixar.u5.t1.a3;

public class principal {
    public static void main(String[] args) {
        HoraExacta HE1 = new HoraExacta(21, 59, 58);
        System.out.println(HE1);
        HE1.inc_sec();
        HE1.inc_sec();
        System.out.println(HE1);
        HE1.setSegundos(642);
        HE1.setSegundos(42);
        System.out.println(HE1);
    }
}
