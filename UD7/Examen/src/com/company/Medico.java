package com.company;

public class Medico {
    //Atributos

    private String nombre;
    private String apellidos;
    private int num_colegiado;
    private String hospital;

    //Constructor

    public Medico(String nombre, String apellidos, int num_colegiado, String hospital){

    }

    //Métodos

    @Override
    public String toString(){
        String datos = "Datos del médico: \n Nombre: " + nombre + "\n Apellidos: " + apellidos + "\n Número de colegiado: " + num_colegiado + "\n Hospital: " + hospital;
        return datos;
    }
}
