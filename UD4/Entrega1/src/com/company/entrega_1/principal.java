package com.company.entrega_1;

import jdk.dynalink.beans.StaticClass;

public class principal {
    public static void main(String[] args) {
        Pizza.tamanos();
        Ingrediente i1 = new Ingrediente (ingredientes.Jamón_codido, 200);
        Ingrediente i2 = new Ingrediente();
        Ingrediente i3 = new Ingrediente (ingredientes.Carne, 350);
        Pizza pizz1 = new Pizza (Size.mediana);
        pizz1.anadir_ingrediente(i2);
        pizz1.anadir_ingrediente(i1);
        pizz1.anadir_ingrediente(i2);
        pizz1.anadir_ingrediente(i2);
        pizz1.mostrar_infromacion();
        Pizza pizz2 = new Pizza ();
        pizz2.anadir_ingrediente(i3);
        pizz2.anadir_ingrediente(i2);
        pizz2.mostrar_infromacion();
        Pedido ped1 = new Pedido(pizz1);
        Pedido ped2 = new Pedido();
        Pedido ped3 = new Pedido(pizz2);
        Pizzeria pizzer1 = new Pizzeria();
        pizzer1.anadir_pedido(ped1);
        pizzer1.anadir_pedido(ped2);
        pizzer1.anadir_pedido(ped3);
        pizzer1.pedidos_realizados();

    }
}
