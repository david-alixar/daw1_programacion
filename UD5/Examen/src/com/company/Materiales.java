package com.company;

public abstract class Materiales {

    //Atributos

    private String nombre;
    private int masa;
    private int cap_quema;
    private int cap_diluir;
    private boolean movibles;
    private final int valor_min = 0;
    private final int valor_max_masa = 1000;
    private final int valor_max = 100;

    //Métodos

    public void mostrarEstado(){
        System.out.println("El estado de los materiales es: masa: " + masa + ", cap_quema: " + cap_quema + ", cap_diluir: " + cap_diluir + " movibles: " + movibles);
    }
}
