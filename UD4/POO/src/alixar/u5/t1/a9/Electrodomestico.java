package alixar.u5.t1.a9;

public class Electrodomestico {

    //Atributos
    protected float precio_base;
    protected colores color;
    protected consumo_energetico consumo;
    protected float peso;

    //Constructores
    public Electrodomestico(){
        precio_base = 100;
        color = colores.blanco;
        consumo = consumo_energetico.F;
        peso = 5;
    }
    public Electrodomestico (float precio_base, float peso){
        this.precio_base = precio_base;
        this.peso = peso;
        color = colores.blanco;
        consumo = consumo_energetico.F;
    }
    public Electrodomestico (float precio_base, colores color, consumo_energetico consumo, float peso){
        this.precio_base = precio_base;
        this.color = color;
        this.consumo = consumo;
        this. peso = peso;
    }

    //Métodos

    public float get_precio_base (){
        return precio_base;
    }
    public colores get_color (){
        return color;
    }
    public consumo_energetico get_consumo (){
        return consumo;
    }
    public float get_peso (){
        return peso;
    }
    public float getPrecioFinal (){
        float precio_final = precio_base;
        switch (consumo){
            case A:
                precio_final += 100;
            case B:
                precio_final += 80;
            case C:
                precio_final += 60;
            case D:
                precio_final += 50;
            case E:
                precio_final += 30;
            case F:
                precio_final += 10;
        }
        if (peso >= 0 && peso < 29){
            precio_final += 10;
        }
        if (peso >= 30 && peso < 49){
            precio_final += 60;
        }
        if (peso >= 50 && peso < 79){
            precio_final += 80;
        }
        if (peso >= 80){
            precio_final +=100;
        }
        return precio_final;
    }
    @Override
    public String toString() {
        String valor_atributos = "Precio: " + precio_base + "€, color: " + color + ", consumo energético: " + consumo + ", peso:" + peso + "kg,precio final:" + getPrecioFinal() + "€";
        return valor_atributos;
    }
}
