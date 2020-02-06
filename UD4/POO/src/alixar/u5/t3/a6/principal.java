package alixar.u5.t3.a6;

import alixar.u5.t3.a2.ColaTabla;
import alixar.u5.t3.a3.ColaLista;

public class principal {
    public static void main(String[] args) {
        Cola c1 = new ColaLista();
        Cola c2 = new ColaTabla();
        c1.encolar(6);
        c1.encolar(16);
        c1.encolar(65);
        c1.encolar(5);
        c1.encolar(11);
        System.out.println(c1.desencolar());
        c2.encolar(6);
        c2.encolar(16);
        c2.encolar(65);
        c2.encolar(5);
        c2.encolar(11);
        System.out.println(c1.desencolar());
        System.out.println(c1.desencolar());
        System.out.println(c1.desencolar());
        System.out.println(c1.desencolar());
        //System.out.println(c1.desencolar());
        System.out.println(c2.desencolar());
        System.out.println(c2.desencolar());
        System.out.println(c2.desencolar());
        System.out.println(c2.desencolar());
        System.out.println(c2.desencolar());
    }
}
