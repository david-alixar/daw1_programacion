package com.company;

public class principal {
    public static void main(String[] args) {
        Materiales m1 = new Cristal("cristal de bohemia", 1200,101,500,true,tipo.TRANSPARENTE);
        Materiales m2 = new Metal("metal pesado", 100,10,50,false,true);
        Materiales m3 = new Rocas("roca", 110,11,400,true,90);
        Materiales m4 = new Metal("metal ligero", 1100,1110,150,true,false);
        Materiales m5 = new Pico("piquito", 500,14,95,true,50);
        Minecraft minecraft = new Minecraft();
        minecraft.anadirMaterial(m1);
        minecraft.anadirMaterial(m2);
        minecraft.anadirMaterial(m3);
        minecraft.anadirMaterial(m4);
        minecraft.anadirMaterial(m5);
        minecraft.mostrarEstado();
        System.out.println(minecraft);

    }
}
