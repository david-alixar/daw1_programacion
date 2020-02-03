package alixar.u5.t3.a4;

public class principal {
    public static void main(String[] args) {
        Conjunto c1 = new Conjunto();
        Conjunto c2 = new Conjunto(12);
        c1.insertarNum(14);
        c1.insertarNum(1);
        c1.insertarNum(4);
        System.out.println(c1.cant_elementos());
        c1.setConjunto();
    }
}
