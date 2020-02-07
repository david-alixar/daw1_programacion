package Entrega_7_feb;

public class Motocicleta extends Terrestre{
    //Constructor

    public Motocicleta(String matricula, int ano_fabricacion, Color color, String nombre){
        this.matricula=matricula;
        this.ano_fab=ano_fabricacion;
        this.color=color;
        this.nombre=nombre;
    }

    //Métodos

    @Override
    public String toString(){
        String datos = "El vehículo terrestre es de tipo motocicleta " + super.toString();
        return datos;
    }
}
