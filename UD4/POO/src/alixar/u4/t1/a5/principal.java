package alixar.u4.t1.a5;
import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una longitud para la cadena: ");
        int n = teclado.nextInt();
        System.out.print("Introduzca una frase con " + n + " o menos caracteres: ");
        String cadena = teclado.next();

        Text b1 = new Text (n, cadena);
        System.out.println("Char:");
        b1.mostrar_informacion();
        b1.anadir_al_final_c('j');
        b1.mostrar_informacion();
        b1.anadir_al_inicio_c('h');
        b1.mostrar_informacion();
        System.out.println("String:");
        b1.mostrar_informacion();
        b1.anadir_al_final_s("paco");
        b1.mostrar_informacion();
        b1.anadir_al_inicio_s("pepe");
        b1.mostrar_informacion();
        System.out.println("La frase contiene " + b1.contar_vocales() + " vocales");
    }
}
