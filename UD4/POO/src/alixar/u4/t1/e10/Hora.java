package alixar.u4.t1.e10;

public class Hora
{
    // Atributos
    private int hora;
    private int minuto;
    private int segundo = 00;

    // Metodos
    Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public void get () {
            System.out.println("Son las " + hora + ":" + minuto + ":" + segundo);
    }

    public void set (int n) {
        while (n > 59) {
            minuto = minuto + 1;
            n = n - 60;
        }
        segundo = n;
        while (minuto > 59) {
            if (hora < 23) {
                hora = hora + 1;
                minuto = minuto - 60;
            }
            else {
                hora = 00;
                minuto = minuto - 60;
            }
        }
    }
}
