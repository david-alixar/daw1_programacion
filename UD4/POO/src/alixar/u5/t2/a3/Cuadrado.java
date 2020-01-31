package alixar.u5.t2.a3;

public class Cuadrado extends PoligonoRegular implements Figura{

    //Constructores
    public Cuadrado(float lado, colores color){
        super();
        this.lado = lado;
        this.color = color;
    }
    public Cuadrado(){
        super();
        lado = 10;
        color = colores.azul;
    }

    //Método
    @Override
    public float getArea(){
        float area = lado * lado;
        return area;
    }
    @Override
    public String toString(){
        String datos = "El cuadrado tiene de lado: " + lado + "cm, tiene un área de: " + getArea() + "cm2 y es de color: " + color;
        return datos;
    }
}
