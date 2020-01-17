package com.company.entrega_1;

public class Pizzeria {
    //Atributos
    private Pedido pedido [] = new Pedido[5];
    private int cant_pedidos = 0;

    //Métodos

    public void anadir_pedido(Pedido pedido) {
        if (cant_pedidos < 5) {
            this.pedido[cant_pedidos] = pedido;
            cant_pedidos++;
        }
    }
    public void pedidos_realizados(){
        for (int i=0; i< cant_pedidos; i++){
            pedido[i].informacion_pedido();
        }
    }
}
