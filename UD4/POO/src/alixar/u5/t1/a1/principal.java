package alixar.u5.t1.a1;

public class principal {
    public static void main(String[] args){
Hora h1 = new Hora(23,25);
h1.hora_actual();
h1.setMinutos(59);
h1.hora_actual();
h1.setHora(18);
h1.hora_actual();
h1.inc();
h1.hora_actual();
System.out.println(h1);
    }
}
