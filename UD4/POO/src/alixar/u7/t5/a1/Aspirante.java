package alixar.u7.t5.a1;


import java.io.Serializable;

public class Aspirante implements Serializable {
    public String getNombre() {
        return nombre;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    //Atributos
    private String nombre;
    private String DNI;
    private String telefono;
    private double media;

    //Constructor
    public Aspirante(String nombre, String DNI, String telefono){
        this.nombre = nombre;
        this.DNI = DNI;
        this.telefono = telefono;
    }

    //Métodos
    @Override
    public String toString(){
        String datos;
        datos = nombre + "  " + DNI + "         " + media + "\n";
        return datos;
    }

}
