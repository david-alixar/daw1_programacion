package com.company;

public class Rocas extends Materiales implements Mezclar{

    //Atributos

    private int dureza;

    //Constructor

    public Rocas(String nombre, int masa, int cap_quema, int cap_diluir, boolean movible, int dureza){
        super(nombre,masa,cap_quema,cap_diluir,movible);
        this.dureza=dureza;
    }

    //Métodos

    @Override
    public void MezclarConMaterial(Materiales material) {
        System.out.println("Rocas de " + super.getNombre());
    }
    @Override
    public String toString() {
        String datos = super.toString() + ", dureza: " + dureza;
        return datos;
    }

}
