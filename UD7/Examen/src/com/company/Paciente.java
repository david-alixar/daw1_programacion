package com.company;

public class Paciente {
    //Atributos

    private String nombre;
    private int edad;
    private int peso;
    private boolean vacunas;
    private Medico medico;
    private char cepa;

    //Constructor
    public Paciente(String nombre, int edad, int peso, boolean vacunas, Medico medico, char cepa){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        this.vacunas=vacunas;
        this.medico=medico;
        this.cepa=cepa;
    }

    //Métodos


    public char getCepa() {
        return cepa;
    }

    public Medico getMedico() {
        return medico;
    }

    public int getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString(){
        String datos = "Datos del paciente: \n Nombre: " + nombre + "\n Edad: " + edad + "\n Peso: " + peso + "\n Tiene vacunas: " + vacunas + "\n Médico" + "\n Cepa: " + cepa;
        return datos;
    }
}
