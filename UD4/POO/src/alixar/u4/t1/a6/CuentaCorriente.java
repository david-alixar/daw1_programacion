package alixar.u4.t1.a6;

public class CuentaCorriente {

    // Atributos
    double saldo;
    int limite_descubrimiento;
    String nombre;
    String dni;
    Banco b;

    // Metodos
    CuentaCorriente(String nombre, String DNI) {
        saldo = 0;
        this.nombre = nombre;
        dni = DNI;
        limite_descubrimiento = -50;
    }

    void mostrar_informacion() {
        System.out.println("La cuenta corriente pertenece a: " + nombre + " con DNI: " + dni);
        System.out.println("Tiene un saldo de: " + saldo + " euros");
        System.out.println("Tiene un límite de descubierto de: " + limite_descubrimiento);
        if ( b != null) {
            b.mostrar_informacion();
        }
    }

    void  cambiar_banco(Banco nuevo_banco) {
        b = nuevo_banco;
//        b.mostrar_informacion();
  //      mostrar_informacion();
    }
}