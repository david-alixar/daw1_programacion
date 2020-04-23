package alixar.u8.t4.a1;

public class principal {
    public static void main(String [] args) {
        String nombreFichero = "cochesXML.xml";
        ParseadorDOM parse1 = new ParseadorDOM();
        parse1.parse(nombreFichero);
    }
}
