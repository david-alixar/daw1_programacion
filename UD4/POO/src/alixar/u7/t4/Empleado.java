package alixar.u7.t4;

public class Empleado extends Persona {

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
        String valor_atributos = "" ;
        return valor_atributos;
    }
}
