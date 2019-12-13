package alixar.u4.t1.a6;

public class principal {
    public static void main(String[] args) {
        Banco b1 = new Banco("El Monte", "C/ Laraña, 4", 10.2);
        Banco b2 = new Banco("Cajasur", "C/ Sagasta, 12");
        CuentaCorriente c1 = new CuentaCorriente ("David", "54789541L");
        //

        c1.mostrar_informacion();
        c1.cambiar_banco(b1);
        System.out.printf("");
        c1.mostrar_informacion();

    }
}