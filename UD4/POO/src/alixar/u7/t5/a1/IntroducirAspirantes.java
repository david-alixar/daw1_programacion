package alixar.u7.t5.a1;


import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class IntroducirAspirantes implements Serializable {
    //Atributos
    private static AtomicInteger count = new AtomicInteger(0);
    private int id;

    //Constructor
    public IntroducirAspirantes(){

    }

    //Métodos
    public void InsertaAspirante(String nombre, String DNI, String telefono, Map aspirantes, List ids){
        id = count.incrementAndGet();

        aspirantes.put(id,new Aspirante(nombre, DNI, telefono));
        ids.add(id);
    }
}
