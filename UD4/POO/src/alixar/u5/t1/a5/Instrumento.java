package alixar.u5.t1.a5;


public abstract class Instrumento {
    // Atributos
    protected Notas [] partituras = new Notas [100];
    protected int cant_notas = 0;

    //Métodos

    public void add(Notas notas){
        if (cant_notas <99) {
            partituras[cant_notas] = notas;
            cant_notas++;
        }
    }

    public abstract void interpretar();

}
