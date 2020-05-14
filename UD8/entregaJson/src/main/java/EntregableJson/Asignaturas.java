package EntregableJson;

public class Asignaturas {

    //Atributos
    private Integer id;
    private String nombre;
    private Integer alumnoId;

    //Constructor

    public Asignaturas(Integer id, String nombre, Integer alumnoId) {
        this.id = id;
        this.nombre = nombre;
        this.alumnoId = alumnoId;
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

    public Integer getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Integer alumnoId) {
        this.alumnoId = alumnoId;
    }

    @Override
    public String toString() {
        return "Asignaturas{" +
                "id: " + id +
                ", nombre: '" + nombre + '\'' +
                ", alumnoId: " + alumnoId +
                '}';
    }
}
