package com.company;

public class Sierra extends Herramientas {

    //Atributos

    private int diametro;

    //Constructor

    public Sierra(String nombre, int masa, int cap_quema, int cap_diluir, boolean movibles, int diametro){
        super(nombre,masa,cap_quema,cap_diluir,movibles);
        this.diametro=diametro;
    }
}
