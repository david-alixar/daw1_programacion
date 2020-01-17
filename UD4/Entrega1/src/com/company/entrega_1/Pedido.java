package com.company.entrega_1;

import java.util.Calendar;

public class Pedido {

    Calendar c = Calendar.getInstance();

    //Atributos
    private Pizza pizza;
    private String dia, mes, annio;
    private String fecha;


    //Métodos
    public Pedido (Pizza pedido){
        this.pizza = pedido;
        fecha = calendario();
    }
    public Pedido (){
        Pizza pizz1 = new Pizza();
        Ingrediente ing1 = new Ingrediente(ingredientes.Jamón_ibérico, 200);
        Ingrediente ing2 = new Ingrediente();
        pizz1.anadir_ingrediente(ing1);
        pizz1.anadir_ingrediente(ing2);
        this.pizza = pizz1;
        fecha = calendario();
    }
    public void informacion_pedido(){
        pizza.mostrar_infromacion();
        System.out.println(fecha);
    }

    public String calendario(){
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH));
        annio = Integer.toString(c.get(Calendar.YEAR));

       fecha = (dia + "/" + mes +"/" + annio);

       return fecha;
    }
}
