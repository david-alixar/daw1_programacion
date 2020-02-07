package Entrega_7_feb;

public class Avioneta extends Aereo {
    //Constructores

    public Avioneta (String OACI, float altitud,String nombre){
        super(OACI);
        this.altitud=altitud;
        this.nombre=nombre;
    }

    //Métodos

    public String tipo(){
        String tipo = " El vehículo aéreo es una avioneta";
        return tipo;
    }

    @Override
    public String volar() {
        String datos = tipo() + " y está volando a una altitud de: " + altitud + " metros";
        return datos;
    }
    @Override
    public String toString(){
        String datos = tipo() + super.toString();
        return datos;
    }
}
