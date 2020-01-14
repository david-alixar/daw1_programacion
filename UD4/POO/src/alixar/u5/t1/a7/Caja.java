package alixar.u5.t1.a7;

public class Caja {

    //Atributos

    protected String etiqueta;
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
        double volumen = ancho * alto * fondo;
        if (u==Unidades.cm){
            volumen = (ancho/100) * (alto/100) * (fondo/100);
        }
        return volumen;
    }

    public void setEtiqueta(String etiqueta){
        this.etiqueta = etiqueta;
    }


    @Override
    public String toString() {
        String result = ancho + " x " + alto + " x " + fondo + " (" + u + ") Dirección: " + etiqueta;
        return result;
    }
}
