package alixar.u4.t1.a3;

public class principal {
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("David", "78945612N");
        //
        c.ingresar_dinero(2000);
        c.sacar_dinero(1125);
        c.mostrar_informacion();

        // c.saldo=500; -> Esto no lo coge, porque saldo es privado.
        //c.limite_descubrimiento=20; -> Esto tampoco lo coge, también es privado
        //c.dni="12345458"; -> Sin embargo, esta sí, puesto que es visible a clases vecinas.
    }
}