package Entrega_7_feb;

public abstract class Vehiculos {

    //Atributos
    protected String nombre;
    protected int num_personas;

    //Métodos

    public void transportar(int num_personas){
        this.num_personas=num_personas + this.num_personas;
    }
    @Override
    public String toString(){
        String datos = " El vehículo tiene de nombre: " + nombre + ". Tiene las siguientes personas: " + num_personas;
        return datos;
    }
}
