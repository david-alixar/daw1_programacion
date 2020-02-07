package Entrega_7_feb;

public abstract class Aereo extends Vehiculos {

    //Atributos
    protected float altitud;
    protected String OACI;

    //Constructor
    public Aereo(String OACI){
        this.OACI=OACI;
    }

    //Métodos
   public abstract String volar();

    @Override
    public String toString(){
        String datos = " El código OACI es: " + OACI + ". Tiene una altitud de: " + altitud + " metros" + super.toString();
        return datos;
    }

}
