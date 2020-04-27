package com.company;
import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;

    private String dni;

    private int telefono;

    private int edad;

    private static int id = 0;

    private int idPersona = 0;

    public Persona(String nombre, String dni, int telefono, int edad) {

        id++;

        this.idPersona = id;

        this.nombre=nombre;

        this.dni=dni;

        this.telefono=telefono;

        this.edad=edad;

    }

    public Persona(){

    }

    public void setNombre (String nom) { nombre=nom;}

    public void setDni (String DNI) { dni=DNI;}

    public void setTelefono (int telf) {telefono=telf;}

    public void setEdad (int ed) {edad=ed;}

    public void setId (int ID) {id=ID;}



    public String getNombre() {return nombre;}

    public String getDni(){
        return dni;
    }

    public int getTelefono() {return telefono;}

    public int getEdad() {return edad;}

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + idPersona +" nombre: " + nombre +  " ,dni: " + dni + " ,teléfono: " + telefono + " ,edad: " + edad + "}\n";
    }
}
