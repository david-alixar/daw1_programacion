package alixar.u7.t4.a1;

import java.io.Serializable;

public class Persona implements Serializable {

    //Atributos
    String dni;
    String nombre;
    int edad;
    double estatura;

    //Constructor
    public Persona (String dni, String nombre, int edad, double estatura){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    //Métodos

}
