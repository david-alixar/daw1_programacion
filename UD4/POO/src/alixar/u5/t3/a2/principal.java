package alixar.u5.t3.a2;

public class principal {
    public static void main(String[] args) {
        ColaTabla ct1 = new ColaTabla();
        ct1.encolar(21);
        ct1.encolar(19);
        ct1.encolar(55);
        ct1.encolar(40);
        ct1.encolar(31);
        ct1.encolar(29);
        ct1.encolar(66);
        ct1.encolar(78);
        System.out.println(ct1.desencolar());
        ct1.encolar(11);
        ct1.encolar(91);

        System.out.println(ct1.desencolar());
        System.out.println(ct1.desencolar());
        System.out.println(ct1.desencolar());
        System.out.println(ct1.desencolar());
        System.out.println(ct1.desencolar());
        System.out.println(ct1.desencolar());
        System.out.println(ct1.desencolar());
        System.out.println(ct1.desencolar());
        System.out.println(ct1.desencolar());
    }
}
