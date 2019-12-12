package alixar.u4.t1.a4;

public class principal {
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("David", "78945612N");
        CuentaCorriente b = new CuentaCorriente("Chema", "78945612N");
        //

        c.mostrar_informacion();
        CuentaCorriente.cambiar_banco("BBVA");


        b.mostrar_informacion();
        CuentaCorriente.cambiar_banco("Unicaja");

    }
}
