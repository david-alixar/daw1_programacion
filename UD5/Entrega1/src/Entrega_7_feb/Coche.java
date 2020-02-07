package Entrega_7_feb;

public class Coche extends Terrestre{

    //Constructor

    public Coche(String matricula, int ano_fabricacion, Color color, String nombre){
        this.matricula=matricula;
        this.ano_fab=ano_fabricacion;
        this.color=color;
        this.nombre=nombre;
    }

    //Métodos

    @Override
    public String toString(){
        String datos = "El vehículo terrestre es de tipo coche " + super.toString();
        return datos;
    }

}