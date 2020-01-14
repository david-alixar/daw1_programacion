package alixar.u5.t1.a8;

import alixar.u5.t1.a7.Caja;
import alixar.u5.t1.a7.Unidades;

public class CajaCarton extends Caja {

    //Atributos

    private int etiqueta;
    private static double area_total;
    private double area;
    //Métodos

    public CajaCarton(double ancho, double alto, double fondo, int etiqueta){
        super(ancho,alto,fondo, Unidades.cm);
        area = 2* ((ancho * fondo) + (ancho * alto) + (fondo * alto));
        area_total = area_total + area;
        this.etiqueta = etiqueta;
    }
    public double getVolumen(){
        double volumen = (ancho * alto * fondo * 0.8);
        return volumen;
    }


    @Override
    public String toString() {
        String result = ancho + " x " + alto + " x " + fondo + " (" + u + "), con volumen: " + getVolumen() + " y la etiqueta nº: " + etiqueta;
        return result;
    }
}
