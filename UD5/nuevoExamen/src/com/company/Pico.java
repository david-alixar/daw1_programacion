package com.company;

public class Pico extends Herramientas implements Minar {

    //Atributos

    private int grosor;

    //Constructor

    public Pico (String nombre, int masa, int cap_quema, int cap_diluir, boolean movibles, int gorosr){
        super(nombre,masa,cap_quema,cap_diluir,movibles);
        this.grosor=grosor;
    }

    //Métodos

    @Override
    public void Hacer(Materiales material) {
        int masa = (super.getMasa());
        int masa_final = masa + 100;
        super.setMasa(masa_final);
    }

    @Override
    public void Deshacer(Materiales material) {
        int masa = (super.getMasa());
        if (masa >= 100) {
            int masa_final = masa - 100;
            super.setMasa(masa_final);
        }
    }

}
