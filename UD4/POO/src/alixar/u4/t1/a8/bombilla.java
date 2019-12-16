package alixar.u4.t1.a8;

class Bombilla {
    // Atributos
    private boolean encendida;
    public InterruptorGeneral ig;

    // Metodos
    Bombilla(boolean encendida) {
        if (ig.interruptor_general) {
            this.encendida = encendida;
        }
    }

    void apa_enc (boolean encendida) {
        if (ig.interruptor_general) {
            this.encendida = encendida;
        }
        else {
            System.out.println("No puede encenderse la bombilla, revise luz general!");
        }
    }
    void general ( boolean interruptor_general){
        ig.interruptor_general = interruptor_general;
    }

    void estado_bombilla () {
        if (encendida && ig.interruptor_general) {
            System.out.println("La bombilla está encendida");
        } else {
            System.out.println("La bombilla está apagada");
        }

    }
}


