package alixar.u4.t1.e9.maquinaria;

    class Vagones {
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