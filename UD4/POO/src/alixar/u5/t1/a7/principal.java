package alixar.u5.t1.a7;

public class principal {
    public static void main(String[] args) {
        Caja c1 = new Caja(14,20,5,Unidades.m);
        Caja c2 = new Caja(1400,2000,500,Unidades.cm);
        System.out.println(c1.getVolumen());
        System.out.println(c2.getVolumen());
        c1.setEtiqueta("Manuel Rodríguez - C/ Loro nº14 Tomares");
        c2.setEtiqueta("Ernesto Varela - C/ Campos nº66 Sevilla");
        System.out.println(c1);
        System.out.println(c2);
    }

}
