package alixar.u4.t1.a1;

public class principal {
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("David", "78945612N");
        //
        c.nombre = "David";
        c.saldo = 100;
        c.ingresar_dinero(2000);
        c.sacar_dinero(1125);
        c.mostrar_informacion();
    }
}
