package alixar.u5.t1.a9;

public class Lavadora extends Electrodomestico {

    //Atributos
    private float carga;

    //Constructores
    public Lavadora (){
        super();
        carga = 5;
    }

    //Métodos
    @Override
    public String toString() {
        String valor_atributos = "Precio: " + precio_base + "€, color: " + color + ", consumo energético: " + consumo + ", peso:" + peso + "kg,precio final:" + getPrecioFinal() + "€, carga:" +carga;
        return valor_atributos;
    }
}
