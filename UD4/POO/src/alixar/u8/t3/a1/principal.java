package alixar.u8.t3.a1;

import alixar.u8.t2.a1.Persona;

public class principal {
    public static void main(String [] args) {
        String nombreFichero = "personas.xml";
        ArbolDOMPersonas arbol1 = new ArbolDOMPersonas(nombreFichero);

        System.out.println("Muestro el contenido del documento " + nombreFichero);
        arbol1.parse();
        System.out.println("Incremento la edad de las siguientes personas que paso por parámetro, siempre y cuando existan en el XML");
        arbol1.incrementoEdad(new Persona("Ramón", 19));
        arbol1.incrementoEdad(new Persona("Pepe", 51));
    }
}
