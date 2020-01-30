package alixar.u5.t2.a3;

public class Triangulo extends PoligonoRegular implements Figura {

    //Atributo
    private float altura;

    //Constructor
    public Triangulo(float lado, colores color, float altura){
        super();
        this.altura = altura;
        this.color = color;
        this.lado = lado;
    }
    public Triangulo(){
        super();
        lado = 10;
        altura = 10;
        color = colores.azul;
    }

    //Método
    @Override
    public float getArea(){
        float area = (lado * altura) / 2;
        return area;
    }
    @Override
    public String toString(){
        String datos = "El triángulo tiene de lado: " + lado + "cm, de altura: " + altura + "cm y es de color: " + color;
        return datos;
    }
}

