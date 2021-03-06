package alixar.u5.t2.a3;

public class Circulo implements Figura{

    //Atributo
    private float radio;

    //Constructor
    public Circulo(float radio){
        this.radio = radio;
    }

    //Métodos
    public float getArea(){
        float area = (float) ((float) (Math.PI * (radio * radio)));
        return area;
    }
    @Override
    public String toString(){
        String datos = "El círculo tiene de radio: " + radio + "cm y un área de " + getArea() + "cm2";
        return datos;
    }
}
