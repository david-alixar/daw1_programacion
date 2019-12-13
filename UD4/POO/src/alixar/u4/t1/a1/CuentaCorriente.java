package alixar.u4.t1.a1;

public class CuentaCorriente {

    // Atributos
    double saldo;
    int limite_descubrimiento;
    String nombre;
    String dni;

    // Metodos
    CuentaCorriente(String nombre, String DNI) {
        saldo = 100;
        this.nombre = nombre;
        dni = DNI;
        limite_descubrimiento = -50;
    }

    boolean sacar_dinero(double peticion) {
        boolean resultado = false;
        if ((saldo - peticion) >= limite_descubrimiento) {
            saldo -= peticion;
            resultado = true;
            System.out.println("Se han sacado " + peticion + " euros");
            System.out.println("Dispone de un saldo de " + saldo + " euros");
        }
        else {
            System.out.println("No se ha podido sacar dinero. Saldo insuficiente");
        }
        return resultado;
    }

    void ingresar_dinero(double ingreso) {
saldo += ingreso;
System.out.println("Se han ingresado " + ingreso + " euros");
System.out.println("Dispone de un saldo de " + saldo + " euros");
    }

    void mostrar_informacion() {
        System.out.println("La cuenta corriente pertenece a: " + nombre + " con DNI: " + dni);
        System.out.println("Tiene un saldo de: " + saldo + " euros");
        System.out.println("Tiene un límite de descubierto de: " + limite_descubrimiento);
    }
}
