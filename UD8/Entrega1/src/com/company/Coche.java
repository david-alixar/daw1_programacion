package com.company;

public class Coche {

    private String marca;

    private String modelo;

    private String combustible;

    private int anno;

    private double cilindrada;

    private static int id = 0;

    private int idCoche = 0;

    public Coche(String marca, String modelo, String combustible, int anno, double cilindrada) {

        id++;

        this.idCoche = id;

        this.marca=marca;

        this.modelo=modelo;

        this.combustible=combustible;

        this.anno=anno;

        this.cilindrada=cilindrada;

    }

    public Coche(){

        this.marca=null;

    }


    public void setMarca (String mar) { marca=mar;}

    public void setModelo (String mod) {modelo=mod;}



    public String getMarca() {return marca;}

    public String getModelo() {return modelo;}

    public String getCombustible() {return combustible;}

    public int getAnno() {return anno;}

    public double getCilindrada() {return cilindrada;}

    public int getIdCoche() {
        return idCoche;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " " + combustible + " " + anno + " " + cilindrada;
    }
}

