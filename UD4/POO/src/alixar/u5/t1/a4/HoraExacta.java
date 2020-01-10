package alixar.u5.t1.a4;

import alixar.u5.t1.a1.Hora;

public class HoraExacta extends Hora {

    private int segundos;

    public HoraExacta (int hora, int minutos, int segundos) {
        super(hora, minutos);
        this.segundos = segundos;
    }

    public void inc_sec() {
        if (segundos < 59) {
            segundos++;
        } else {
            segundos = 00;
            super.inc();
        }

    }
    void setSegundos(int segundos) {
        if (segundos > 59) {
            System.out.println("Los segundos introducidos son erróneos!");
        } else {
            this.segundos = segundos;
        }
    }

    @Override
    public boolean equals(Object o){
        HoraExacta otra_hora = (HoraExacta) o;
        boolean iguales = false;
        if (this.hora == otra_hora.hora && this.minutos == otra_hora.minutos && this.segundos == otra_hora.segundos){
            iguales = true;
        }
        return iguales;

    }

    @Override
    public String toString() {
        String result = hora + ":" + minutos + ":" + segundos;
        return result;
    }
}
