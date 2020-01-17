package com.company.entrega_1;

public class Ingrediente {

    //Atributos
    private ingredientes nombre;
    private int calorias_100;

    //Métodos

    public Ingrediente (ingredientes nombre, int calorias_100){
        this.nombre = nombre;
        this.calorias_100 = calorias_100;
    }

    public Ingrediente (){
        nombre = ingredientes.Queso;
        calorias_100 = 250;
    }

    public void mostrar_ingrediente(){
        System.out.println(nombre);
    }
}
