package alixar.u5.t2.a3;

public class Cuadrado extends PoligonoRegular {

    //Constructores
    public Cuadrado(float lado, colores color){
        super();
        this.lado = lado;
        this.color = color;
    }
    public Cuadrado(){
        lado = 10;
        color = colores.azul;
    }

    //Método
    public float getArea(){
        float area = lado * lado;
        return area;
    }
}
