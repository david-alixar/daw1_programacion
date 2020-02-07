package Entrega_7_feb;

public class Terrestre extends Vehiculos implements Comparable{

    //Atributos

    protected String matricula;
    protected int ano_fab;
    protected Color color;


    //Métodos

    public int getAno_fab(){
        return ano_fab;
    }
    @Override
    public int compareTo(Object o) {
        Terrestre otro_terrestre = (Terrestre) o;
        return this.matricula.compareTo(otro_terrestre.matricula);
    }

    @Override
    public String toString(){
        String datos = " La matrícula es: " + matricula + ". Fabricado en el año: " + ano_fab + ", Color " + color + super.toString();
        return datos;
    }
    @Override
    public boolean equals(Object o){
        Terrestre otro_terrestre = (Terrestre) o;
        return this.matricula.equals(otro_terrestre.matricula);
    }
}
