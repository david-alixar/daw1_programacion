package alixar.u5.t1.a9;

public class principal {
    public static void main(String[] args) {
        Electrodomestico E1 = new Electrodomestico();
        System.out.println(E1);
        Electrodomestico E2 = new Electrodomestico(500, 100);
        System.out.println(E2);
        Lavadora l1 = new Lavadora();
        System.out.println(l1);
    }
}
