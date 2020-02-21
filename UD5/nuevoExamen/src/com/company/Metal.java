package com.company;

public class Metal extends Materiales implements Mezclar{

    //Atributos

    private boolean imantable;

    //Constructor

    public Metal(String nombre, int masa, int cap_quema, int cap_diluir, boolean movible, boolean imantable){
        super(nombre,masa,cap_quema,cap_diluir,movible);
        this.imantable=imantable;
    }

    //Métodos

    @Override
    public void MezclarConMaterial(Materiales material) {
        System.out.println("Metal de " + super.getNombre());
    }
    @Override
    public String toString() {
        String datos = super.toString() + ", imantable: " + imantable;
        return datos;
    }

}
