package alixar.u7.t4.a1;


import java.io.Serializable;

public class Empleado extends Persona implements Serializable {

    //Atributos

    int sueldo;

    //Constructor

    public Empleado (String dni, String nombre, int edad, double estatura, int sueldo){
        super(dni, nombre, edad, estatura);
        this.sueldo = sueldo;
    }

    //Métodos

    @Override
    public String toString() {
        String valor_atributos = "DNI: " +  dni + " Nombre: " + nombre + " Edad: " + edad + " Estatura: " + estatura + " Sueldo: " + sueldo;
        return valor_atributos;
    }


}
