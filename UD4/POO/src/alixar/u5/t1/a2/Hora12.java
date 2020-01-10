package alixar.u5.t1.a2;

import alixar.u5.t1.a1.Hora;

public class Hora12 extends Hora {

    private Meridiano tipo;

public Hora12(int hora, int minutos, Meridiano tipo){
    super(hora, minutos);
    setHora(hora);
    this.tipo = tipo;
}

@Override
public void setHora (int hora){
    super.setHora(hora);
    if (hora > 12){
        this.hora = hora -12;
            tipo = Meridiano.PM;
    }else{
        this.hora = hora;
        tipo = Meridiano.AM;
    }
}
    @Override
    public String toString() {
        String result = hora + ":" + minutos + "-" + tipo;
        return result;
    }
{
}

}
