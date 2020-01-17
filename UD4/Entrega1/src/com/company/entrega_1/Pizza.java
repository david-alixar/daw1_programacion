package com.company.entrega_1;


import jdk.dynalink.beans.StaticClass;

import java.util.Arrays;

public class Pizza {

    //Atributos
    private Size tamano;
    private Ingrediente ingrediente [] = new Ingrediente[3];
    private int cant_ingredientes = 0;

    //Métodos

    public Pizza (Size tamano){
        this.tamano = tamano;
    }
    public Pizza (){
        tamano = Size.familiar;
    }

    public static void tamanos (){
        System.out.println(Arrays.toString(Size.values()));;
    }

    public boolean anadir_ingrediente (Ingrediente ingrediente){
        boolean ingrediente_anadido = false;
        if (cant_ingredientes <3){
            this.ingrediente[cant_ingredientes] = ingrediente;
            cant_ingredientes++;
            ingrediente_anadido = true;
        }

        return ingrediente_anadido;
    }

    public void mostrar_infromacion(){
        System.out.println("La piza elegida es de tamaño: " + tamano + " con los siguientes ingredientes:");
        for (int i=0; i< cant_ingredientes; i++){
            ingrediente[i].mostrar_ingrediente();
        }
    }
}
