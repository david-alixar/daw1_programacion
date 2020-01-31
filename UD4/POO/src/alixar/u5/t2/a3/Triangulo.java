package alixar.u5.t2.a3;

public class Triangulo extends PoligonoRegular implements Figura, Comparable {

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
    public float get_lado() {
        return lado;
    }
    public colores get_color(){
        return color;
    }
    @Override
    public float getArea(){
        float area = (lado * altura) / 2;
        return area;
    }
    @Override
    public String toString(){
        String datos = "El triángulo tiene de lado: " + lado + "cm, de altura: " + altura + "cm, un área de: " + getArea() + "cm2 y es de color: " + color;
        return datos;
    }

    @Override
    public int compareTo(Object o) {
        int resultado = 0;
        Triangulo nuevoTriangulo = (Triangulo) o;
        if (this.lado < nuevoTriangulo.get_lado()) {
            resultado = -1;
        }
        else if (lado > nuevoTriangulo.get_lado()){
            resultado = 1;
        }
        return resultado;
    }
}

