package alixar.u4.t1.a6;

public class Banco {

    // Atributos
    private String nombre;
    double capital = 5.2;
    String direccion_central;

    // Metodos
    Banco(String nombre, String direccion_central, double capital) {
        this.capital = capital;
        this.nombre = nombre;
        this.direccion_central = direccion_central;
    }
    Banco(String nombre, String direccion_central) {
        this.nombre = nombre;
        this.direccion_central = direccion_central;
    }

    void mostrar_informacion(){
        System.out.println("El banco " + nombre + " dispone de un capital de: " + capital + " millones de euros. La dirección central es: " + direccion_central);
    }
}
