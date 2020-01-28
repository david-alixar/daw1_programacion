package alixar.u5.t2.a3;

public class Triangulo extends PoligonoRegular {

    //Atributo
    private float altura;

    //Constructor
    public Triangulo(float lado, colores color, float altura){
        super();
        this.altura = altura;
    }
    public Triangulo(){
        lado = 10;
        altura = 10;
        color = colores.azul;
    }

    //Método
    public float getArea(){
        float area = (lado * altura) / 2;
        return area;
    }
}

