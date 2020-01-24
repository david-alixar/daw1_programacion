package alixar.u5.t1.a9;

public class Television extends Electrodomestico {

    //Atributos
    private int resolucion;
    private boolean sintonizadorTDT;

    //Constructores
    public Television(){
        super();
        resolucion = 20;
        sintonizadorTDT = false;
    }
    public Television (float precio, float peso){
        super(precio,peso);
        resolucion = 20;
        sintonizadorTDT = false;
        super.precio_base = precio;
        super.peso = peso;
    }
    public Television (int resolucion, boolean TDT, float precio, float peso, colores color, consumo_energetico consumo){
        this.resolucion = resolucion;
        sintonizadorTDT = TDT;
        super.precio_base = precio;
        super.peso = peso;
        super.color = color;
        super.consumo = consumo;
    }

    //Métodos
    public int get_resolucion(){
        return resolucion;
    }
    public boolean getTDT(){
        return sintonizadorTDT;
    }
    public float getPrecioFinal(){
        float precio_final = super.getPrecioFinal();
        if (sintonizadorTDT = true){
            precio_final += 50;
        }
        if (resolucion >= 40){
           precio_final = precio_final + ((precio_final * 30) / 100);
        }

        return precio_final;
    }

    @Override
    public String toString() {
        String valor_atributos = "Precio base: " + precio_base + "€, color: " + color + ", \n consumo energético: " + consumo + ", peso:" + peso + "kg,precio final:" + getPrecioFinal() + "€, resolución:" + resolucion + " pulgadas, TDT: " + sintonizadorTDT;
        return valor_atributos;
    }
}
