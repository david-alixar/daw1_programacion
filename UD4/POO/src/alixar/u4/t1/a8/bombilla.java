package alixar.u4.t1.a8;

public class bombilla {
    // Atributos
    private boolean encendida;
    public InterruptorGeneral ig;
    private int id_bombilla;

    // Metodos
    bombilla(boolean encendida, InterruptorGeneral ig, int id_bombilla) {
        this.ig = ig;
        this.id_bombilla = id_bombilla;
        if (ig.estado_general()) {
            this.encendida = encendida;
        }
    }

    void apa_enc (boolean encendida) {
        if (ig.estado_general()) {
            this.encendida = encendida;
        }
        else {
            System.out.println("No puede encenderse la bombilla, revise luz general!");
        }
    }

    void estado_bombilla () {
        if (encendida && ig.estado_general()) {
            System.out.println("La bombilla " + id_bombilla + " está encendida");
        } else {
            System.out.println("La bombilla " + id_bombilla + "  está apagada");
        }

    }
}


