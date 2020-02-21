package com.company;

public abstract class Materiales implements Comparable {

    //Atributos

    private String nombre;
    private int masa;
    private int cap_quema;
    private int cap_diluir;
    private boolean movible;

    //Constructor

    public Materiales (String nombre, int masa, int cap_quema, int cap_diluir, boolean movible){
        this.nombre=nombre;
        if (masa >= 1 && masa <= 1000) {
            this.masa = masa;
        }
        else{
            this.masa = 500;
        }
        if (cap_quema >= 0 && cap_quema <= 100) {
            this.cap_quema = cap_quema;
        }
        else{
            this.cap_quema = 50;
        }
        if (cap_diluir >= 0 && cap_diluir <= 100) {
            this.cap_diluir = cap_diluir;
        }
        else{
            this.cap_diluir = 50;
        }
        this.movible =movible;
    }

    //Métodos


    public  String getNombre(){
        return nombre;
    }

    public int getCap_quema(){
        return cap_quema;
    }

    public int getCap_diluir(){
        return cap_diluir;
    }

    public int getMasa(){
        return masa;
    }
    public void setMasa(int masa){
        this.masa=masa;
    }

    @Override
    public int compareTo(Object o){
        int resultado = 0;
        Materiales otroMaterial = (Materiales) o;
        if (this.masa < otroMaterial.getMasa()) {
            resultado = -1;
        }
        else if (this.masa > otroMaterial.getMasa()){
            resultado = 1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        String datos = "Datos del material: nombre: " + nombre + ", masa: " + masa + ", cap_quema: " + cap_quema + " \b, cap_diluir: " + cap_diluir + ", movible: " + movible;
        return datos;
    }
}
