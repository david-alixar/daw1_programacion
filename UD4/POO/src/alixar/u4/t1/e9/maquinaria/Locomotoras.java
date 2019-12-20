package alixar.u4.t1.e9.maquinaria;

import alixar.u4.t1.e9.personal.Mecanicos;

public class Locomotoras {
    // Atributos
    private String matricula;
    private double potencia;
    private double ano_fabricacion;
    private Mecanicos mecanico;

    // Metodos
    public Locomotoras (String matricula, double potencia, double ano_fabricacion, Mecanicos mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.ano_fabricacion = ano_fabricacion;
        this.mecanico = mecanico;
    }

    public void cambiar_mecanico (Mecanicos nuevo_mecanico) {
        mecanico = nuevo_mecanico;
    }
}