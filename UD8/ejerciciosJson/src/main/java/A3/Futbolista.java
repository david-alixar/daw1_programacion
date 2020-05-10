package A3;

import java.util.List;
import java.util.Map;

public class Futbolista {
    private Integer id;
    private String nombre;
    private String equipo;
    private Map<String,Integer> estadisticas;


    public Futbolista(String nombre, Map<String,Integer> estadisticas, String equipo) {
        this.nombre = nombre;
        this.estadisticas = estadisticas;
        this.equipo = equipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public Map getEstadisticas() {
        return estadisticas;
    }

    public String getEquipo() {
        return equipo;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadisticas(Map<String,Integer> estadisticas) {
        this.estadisticas = estadisticas;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                ", estadisticas=" + estadisticas +
                '}';
    }
}
