package alixar.u4.t2.a1;

public class principal {
    public static void main(String[] args) {
        Lista list1 = new Lista ();
        Lista list2 = new Lista (4);
        list1.anadir_elem(4);
        list1.anadir_elem(6);
        list1.anadir_posicion(8,3);
        list1.anadir_final(9);
        list1.anadir_inicio(1);
        list1.anadir_lista();
        list1.eliminar_elemento(8);
        System.out.println(list1.num_elem());
        System.out.println(list1.devolver_elem(8));
        System.out.println(list1.devolver_lista());
        System.out.println(list1.buscar_num(4));
    }
}
