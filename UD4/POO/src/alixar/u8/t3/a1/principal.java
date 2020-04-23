package alixar.u8.t3.a1;

import alixar.u8.t2.a1.Persona;

public class principal {
    public static void main(String [] args) {
        String nombreFichero = "personas.xml";
        ArbolDOMPersonas arbol1 = new ArbolDOMPersonas(nombreFichero);
        //arbol1.parse();
        arbol1.incrementoEdad(new Persona("Pepe", 48));
    }
}
