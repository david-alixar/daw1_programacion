package alixar.u6.t2.a9;


import java.io.Serializable;

public class Mecanicos implements Serializable {
    // Atributos
    private String nombre;
    private String telefono;
    private Especialidad especialidad;

    // Metodos
   public Mecanicos(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
}