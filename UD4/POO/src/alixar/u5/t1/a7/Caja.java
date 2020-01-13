package alixar.u5.t1.a7;

public class Caja {

    //Atributos

    protected double ancho;
    protected double alto;
    protected double fondo;
    protected Unidades u;

    //Métodos

    public Caja (double ancho, double alto, double fondo, Unidades u){
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.u = u;
    }

    public double getVolumen(){
        if (u==Unidades.cm){
            ancho = ancho / 100;
            alto = alto / 100;
            fondo = fondo / 100;
        }
        double volumen = ancho * alto * fondo;
        return volumen;
    }
}
