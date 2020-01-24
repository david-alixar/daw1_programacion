package alixar.u5.t1.a9;

public class Lavadora extends Electrodomestico implements Comparable{

    //Atributos
    private float carga;

    //Constructores
    public Lavadora (){
        super();
        carga = 5;
    }
    public Lavadora (float precio, float peso){
        super(precio,peso);
        carga = 5;
        this.precio_base = precio;
        this.peso = peso;
    }
    public Lavadora (float carga, float precio, float peso, colores color, consumo_energetico consumo){
        this.carga = carga;
        this.precio_base = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    //Métodos
    public float get_carga(){
        return carga;
    }
    public float getPrecioFinal(){
        float precio_final = super.getPrecioFinal();
        if (carga >= 30){
            precio_final += 50;
        }
        return precio_final;
    }
    @Override
    public String toString() {
        String valor_atributos = "Precio base: " + precio_base + "€, color: " + color + ", \n consumo energético: " + consumo + ", peso:" + peso + "kg,precio final:" + getPrecioFinal() + "€, carga:" + carga;
        return valor_atributos;
    }
    @Override
    public int compareTo(Object o){
        int resultado = 0;
        Lavadora otraLavadora = (Lavadora) o;
        if (this.carga < otraLavadora.get_carga()) {
            resultado = -1;
        }
        else if (carga > otraLavadora.get_carga()){
            resultado = 1;
        }
        return resultado;
    }
}
