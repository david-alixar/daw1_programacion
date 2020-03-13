package com.company;

public class principal {
    public static void main(String [] args) {
        Medico m1 = new Medico("Juan", "Pérez López", 545, "Virgen del Rocío");
        Medico m2 = new Medico("Rodrigo", "Fernández García", 362,"La Fe");
        Medico m3 = new Medico("Marta", "Ramírez Vázquez", 895,"La Paz");

        Paciente p1 = new Paciente("Eulalio", 78, 70, true, m1, 'A');
        Paciente p2 = new Paciente("Ernesto", 58, 50, false, m3, 'C');
        Paciente p3 = new Paciente("Joaquín", 51, 99, false, m2, 'B');
        Paciente p4 = new Paciente("José María", 85, 95, false, m1, 'A');
        Paciente p5 = new Paciente("Esteban", 44, 110, true, m2, 'B');
        Paciente p6 = new Paciente("Loli", 13, 61, false, m3, 'C');
        Paciente p7 = new Paciente("Carmen", 86, 65, false, m2, 'A');
        Paciente p8 = new Paciente("Juana", 72, 40, true, m1, 'B');
        Paciente p9 = new Paciente("Roberto", 66, 90, false, m3, 'A');
        Paciente p10 = new Paciente("Mario", 38, 85, true, m2, 'C');
        Coronavirus corona1 = new Coronavirus("Covid19", "Wuhan");
        corona1.addPaciente('A', p1);
        corona1.addPaciente('C', p2);
        corona1.addPaciente('B', p3);
        corona1.addPaciente('A', p4);
        corona1.addPaciente('B', p5);
        corona1.addPaciente('C', p6);
        corona1.addPaciente('A', p7);
        corona1.addPaciente('B', p8);
        corona1.addPaciente('A', p9);
        corona1.addPaciente('C', p10);
        corona1.darDeAtaPaciente(p1);
        corona1.pacientesPorPeso('B');
        corona1.pacientesPorEdad('B');
        corona1.guardarPacientes();
        corona1.cargarPacientes();
    }
}
