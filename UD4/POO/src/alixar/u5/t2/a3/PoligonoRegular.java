package alixar.u5.t2.a3;

public abstract class PoligonoRegular implements Figura {

    //Atributos
    protected float lado;
    public colores color;
    private static int contadorPoligonos = 0;

    //Constructor
    public PoligonoRegular(){
        contadorPoligonos++;
    }

    //Métodos

    @Override
    public float getArea() {
        return 0; //!!!!!!!!!!
    }
}
