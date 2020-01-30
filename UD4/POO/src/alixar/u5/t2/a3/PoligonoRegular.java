package alixar.u5.t2.a3;

public abstract class PoligonoRegular {

    //Atributos
    protected float lado;
    public colores color;
    public static int contadorPoligonos = 0;

    //Constructor
    public PoligonoRegular(){

        contadorPoligonos++;
    }

}
