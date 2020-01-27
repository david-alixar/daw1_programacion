package alixar.u5.t2.a1;

import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pila p1 = new PilaTabla();
        Pila p2 = new PilaLista();
        for (int i = 1; i<=10; i++){
            Integer numero = teclado.nextInt();
            p1.apilar(numero);
        }
        for (int i = 1; i<=10; i++){
            System.out.println(p1.desapilar());;
        }
        for (int i = 1; i<=10; i++){
            Integer numero = teclado.nextInt();
            p2.apilar(numero);
        }
        for (int i = 1; i<=10; i++){
            System.out.println(p2.desapilar());;
        }
    }
}
