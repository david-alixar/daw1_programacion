package alixar.u8.t2.a1;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;

    private int edad;

    private static int id = 0;

    private int idPersona = 0;

    public Persona(String nombre, int edad) {

        id++;

        this.idPersona = id;

        this.nombre=nombre;

        this.edad=edad;

    }

    public Persona(){

        this.nombre=null;

    }

    public void setNombre (String nom) { nombre=nom;}

    public void setEdad (int ed) {edad=ed;}



    public String getNombre() {return nombre;}

    public int getEdad() {return edad;}

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return nombre + " " + edad;
    }
}
