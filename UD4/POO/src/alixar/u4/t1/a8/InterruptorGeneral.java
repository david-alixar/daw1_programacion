package alixar.u4.t1.a8;

public class InterruptorGeneral {
    // Atributos
    protected boolean interruptor_general;

    // Metodos
    public InterruptorGeneral() {
        interruptor_general = true;
    }

    void general ( boolean interruptor_general){
        this.interruptor_general = interruptor_general;
    }

    boolean estado_general () {
        return interruptor_general;
    }

}

