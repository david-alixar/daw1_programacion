package com.company;

public class Cristal extends Materiales implements Mezclar{

    //Atributos

    private tipo tipo;

    //Constructor

    public Cristal(String nombre, int masa, int cap_quema, int cap_diluir, boolean movible, tipo tipo){
        super(nombre,masa,cap_quema,cap_diluir,movible);
        this.tipo=tipo;
    }

    //Métodos

    @Override
    public void MezclarConMaterial(Materiales material) {
        System.out.println("Cristal de " + super.getNombre());
    }
    @Override
    public String toString() {
        String datos = super.toString() + ", de tipo: " + tipo;
        return datos;
    }

}
