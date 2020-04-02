package alixar.u8.t1.a1;

public class principal {
    public static void main(String [] args) {
        ParseadorDomPersonas par1 = new ParseadorDomPersonas();
        String nombre = "personas.xml";
        par1.parse(nombre);
    }
}
