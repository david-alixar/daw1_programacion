package alixar.u5.t3.a4;

public class principal {
    public static void main(String[] args) {
        Conjunto c1 = new Conjunto();
        Conjunto c2 = new Conjunto(12);
        c1.insertarNum(14);
        c1.insertarNum(1);
        c1.insertarNum(4);
        c1.insertarNum(19);
        c1.insertarNum(16);
        c1.insertarNum(24);
        c1.insertarNum(94);
        c1.insertarNum(79);
        c1.insertarNum(56);
        c1.insertarNum(74);
        c1.insertarNum(64);
        System.out.println(c1.cant_elementos());
        c1.mostrar_conjunto();
        c1.eliminarNum(19);
        System.out.println(c1.cant_elementos());
        c1.mostrar_conjunto();
        System.out.println(c1.pertenece(19));
        c2.insertarNum(99);
        c2.anadir_conjunto(c1);
        c2.mostrar_conjunto();
        //c2.eliminar_del_conjunto(c1);
        //c2.mostrar_conjunto();
        System.out.println(Conjunto.incluido(c1,c2));
        Conjunto.union(c1,c2).mostrar_conjunto();
        Conjunto.interseccion(c1,c2).mostrar_conjunto();
        Conjunto.diferencia(c2,c1).mostrar_conjunto();
    }
}
