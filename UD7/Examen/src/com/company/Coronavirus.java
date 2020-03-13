package com.company;

import java.io.*;
import java.util.*;

public class Coronavirus {
    //Atributos

    private String nombre;
    private String localidad_origen;

    Map<Character, Set> mapa1 = new HashMap<>();

    //Constructor

    public Coronavirus (String nombre, String localidad_origen){
        this.nombre=nombre;
        this.localidad_origen=localidad_origen;
    }

    //Métodos

    public void addPaciente(char cepa, Paciente p1) {
        if (cepa == p1.getCepa()) {
            if (mapa1.get(p1.getCepa()) == null) {
                Set < Paciente > cepaA = new HashSet<>();
                cepaA.add(p1);
                mapa1.put(cepa, cepaA);
            } else {
                Set < Paciente > cepaA = new HashSet<>(mapa1.get(p1.getCepa()));
                cepaA.add(p1);
                mapa1.put(cepa, cepaA);
            }
        }
        else{
            System.out.println("Error! Este paciente no tiene la cepa de este conjunto");
        }
    }

    public void darDeAtaPaciente(Paciente p1){
        if (mapa1.get(p1.getCepa()).contains(p1)){
            mapa1.get(p1.getCepa()).remove(p1);
        }
        else{
            System.out.println("No se ha encontrado el paciente");
        }
    }

    public void pacientesDeUnDoctor(int cod_colegiado){

    }

    public void pacientesPorPeso (char cepa){
        Set <Paciente> cepaA = new TreeSet<>(new Comparator(){
            public int compare(Object obj1, Object obj2) {
                int resultado = 0;
                Paciente p1 = (Paciente) obj1;
                Paciente p2 = (Paciente) obj2;
                if (p1.getPeso() < p2.getPeso()) {
                    resultado = 1;
                }
                else if (p1.getPeso() > p2.getPeso()) {
                    resultado = -1;
                }
                return resultado;
            }
        });
        cepaA.addAll(mapa1.get(cepa));
        System.out.println("Pacientes ordenados por peso: \n" + cepaA);
    }

    public void pacientesPorEdad(char cepa){
        Set <Paciente> cepaA = new TreeSet<>(new Comparator(){
            public int compare(Object obj1, Object obj2) {
                int resultado = 0;
                Paciente p1 = (Paciente) obj1;
                Paciente p2 = (Paciente) obj2;
                if (p1.getEdad() < p2.getEdad()) {
                    resultado = 1;
                }
                else if (p1.getEdad() > p2.getEdad()) {
                    resultado = -1;
                }
                return resultado;
            }
        });
        cepaA.addAll(mapa1.get(cepa));
        System.out.println("Pacientes ordenados por edad: \n" + cepaA);
    }

    public void cargarPacientes(){
        final String fichero = "pacientes.dat";
        try{
            FileInputStream archivo = new FileInputStream(fichero);
            ObjectInputStream in = new ObjectInputStream(archivo);

            Map<Character, Set> mapa1 = (Map<Character, Set>) in.readObject();
            in.close();
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }

    public void guardarPacientes(){
        final String fichero = "pacientes.dat";
        try{
            FileOutputStream archivo = new FileOutputStream(fichero);
            ObjectOutputStream out = new ObjectOutputStream(archivo);

            out.writeObject(mapa1);
            out.close();
        }
        catch (IOException e) {
            System.out.println("¡Error al abrir el fichero!");
        }
    }
}
