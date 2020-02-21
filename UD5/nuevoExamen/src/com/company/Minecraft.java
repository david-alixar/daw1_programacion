package com.company;

import java.util.Comparator;
import java.util.Arrays;

public class Minecraft {

    //Atributos

    private Materiales [] materiales;
    private int contador = 0;

    //Constructor

    public Minecraft(){
        this.materiales = new Materiales [10];
    }

    //Métodos

    public void anadirMaterial(Materiales material){
        if (contador < 9){
                materiales[contador]=material;
                contador++;
        }
    }
    public void mostrarEstado(){
        System.out.println(Arrays.toString(materiales));
    }

    public void ordenar_por_diluir() {
        Arrays.sort(
                materiales,
                new Comparator() {
                    public int compare(Object obj1, Object obj2) {
                        int resultado = 0;
                        Materiales m1 = (Materiales) obj1;
                        Materiales m2 = (Materiales) obj2;
                        if (m1.getCap_diluir() < m2.getCap_diluir()) {
                            resultado = -1;
                        } else if (m1.getCap_diluir() > m2.getCap_diluir()) {
                            resultado = 1;
                        }
                        return resultado;
                    }
                });
    }

    public void ordenar_por_quema() {
        Arrays.sort(
                materiales,
                new Comparator() {
                    public int compare(Object obj1, Object obj2) {
                        int resultado = 0;
                        Materiales m1 = (Materiales) obj1;
                        Materiales m2 = (Materiales) obj2;
                        if (m1.getCap_quema() < m2.getCap_quema()) {
                            resultado = -1;
                        } else if (m1.getCap_quema() > m2.getCap_quema()) {
                            resultado = 1;
                        }
                        return resultado;
                    }
                });
    }

    @Override
    public String toString() {
        String datos = Arrays.toString(materiales);
        return datos;
    }
}
