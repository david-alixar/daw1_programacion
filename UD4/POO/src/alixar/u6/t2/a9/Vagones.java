package alixar.u6.t2.a9;

import java.io.Serializable;

class Vagones implements Serializable {
    // Atributos
    private double capacidad_max;
    private double capacidad_actual;
    private String mercancia;

    // Metodos
    protected Vagones(double capacidad_max, double capacidad_actual, String mercancia) {
        this.capacidad_max = capacidad_max;
        this.capacidad_actual = capacidad_actual;
        this.mercancia = mercancia;
    }
}