package alixar.u4.t1.a2;

public class principal {
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("David", "78945612N");
        CuentaCorriente c2 = new CuentaCorriente(0);
        CuentaCorriente c3 = new CuentaCorriente(100, -50, "78945612C");
        //
        c1.nombre = "David";
        c1.saldo = 100;
        c3.mostrar_informacion();
        System.out.println("Otro:");
        c2.mostrar_informacion();
    }
}