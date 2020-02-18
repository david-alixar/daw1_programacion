package alixar.u6.t2.a9;

public class Maquinistas {
    // Atributos
    private String nombre;
    private String dni;
    private double sueldo_mensual;
    private String rango;

    // Metodos
    public Maquinistas(String nombre, String dni, double sueldo_mensual, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this. sueldo_mensual = sueldo_mensual;
        this.rango = rango;
    }
    @Override
    public String toString() {
        String resumen = "El maquinista se llama: " + nombre + ", con DNI: " + dni + ", con sueldo: " + sueldo_mensual + " y tiene un rango de: " + rango ;
        return resumen;
    }
}
