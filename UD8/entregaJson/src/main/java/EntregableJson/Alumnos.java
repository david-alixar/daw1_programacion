package EntregableJson;

import java.util.List;

public class Alumnos {

    //Atributos
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private List<Asignaturas> asignaturas;

    //Constructor

    public Alumnos(Integer id, String nombre, String apellidos, Integer edad, List<Asignaturas> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.asignaturas = asignaturas;
    }

    //Métodos

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public List<Asignaturas> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignaturas> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "id: " + id +
                ", nombre:' " + nombre + '\'' +
                ", apellidos:' " + apellidos + '\'' +
                ", edad: " + edad +
                ", asignaturas: " + asignaturas +
                '}';
    }
}
