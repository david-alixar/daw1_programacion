package alixar.u5.t3.a3;

public class principal {
    public static void main(String[] args) {
        ColaLista cl1 = new ColaLista();
        cl1.encolar(21);
        cl1.encolar(19);
        cl1.encolar(55);
        cl1.encolar(40);
        cl1.encolar(31);
        cl1.encolar(29);
        cl1.encolar(66);
        cl1.encolar(78);
        cl1.encolar(11);
        cl1.encolar(91);

        System.out.println(cl1.desencolar());
        System.out.println(cl1.desencolar());
        System.out.println(cl1.desencolar());
        System.out.println(cl1.desencolar());
        System.out.println(cl1.desencolar());
        System.out.println(cl1.desencolar());
        System.out.println(cl1.desencolar());
        System.out.println(cl1.desencolar());
        System.out.println(cl1.desencolar());
        System.out.println(cl1.desencolar());
    }
}
