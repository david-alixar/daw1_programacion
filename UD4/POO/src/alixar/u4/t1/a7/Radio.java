package alixar.u4.t1.a7;

public class Radio {
    // Atributos
    private double frecuencia;
    private double frecuencia_min;
    private double frecuencia_max;
    private double salto;

    // Metodos
    Radio(long frecuencia) {
        this.frecuencia = frecuencia;
        frecuencia_min = 80;
        frecuencia_max = 108;
        salto = 0.5;
    }

    void up (int cant_saltos) {
        double total = cant_saltos * salto;
        if (total + frecuencia <= frecuencia_max) {
            frecuencia = total + frecuencia;
        }
        else {
            frecuencia = frecuencia_min;
        }
    }

    void down (int cant_saltos) {
        double total = cant_saltos * salto;
        if (frecuencia - total >= frecuencia_min) {
            frecuencia = frecuencia - total;
        }
        else {
            frecuencia = frecuencia_max;
        }
    }

    void display (){
        System.out.println("La frecuencia actual es: " + frecuencia);
    }
}
