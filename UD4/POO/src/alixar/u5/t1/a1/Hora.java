package alixar.u5.t1.a1;

public class Hora {
    // Atributos
    protected int hora;
    protected int minutos;

    // Metodos
    public Hora(int hora, int minutos) {
        if (hora < 24 && minutos < 60) {
            this.hora = hora;
            this.minutos = minutos;
        } else {
            System.out.println("La hora introducida no es correcta, introduzca otra");
        }
    }

    void hora_actual() {
        System.out.println("Son las " + hora + ":" + minutos);
    }

    public void inc() {
        if (minutos < 59) {
            minutos++;
        } else {
            hora++;
            minutos = 00;
        }
    }

    void setMinutos(int minutos) {
        if (minutos > 59) {
            System.out.println("Los minutos introducidos son erróneos!");
        } else {
            this.minutos = minutos;
        }
    }

    protected void setHora(int hora) {
        if (hora > 23) {
            System.out.println("La hora introducida no es correcta!");
        } else {
            this.hora = hora;
        }
    }
    @Override
    public String toString() {
        String result = hora + ":" + minutos;
        return result;
    }

}

