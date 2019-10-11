package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos;

        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);

        System.out.println("La hora actual es " + hora + ":" + minutos + ":" + segundos);
    }
}