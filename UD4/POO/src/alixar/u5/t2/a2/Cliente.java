package alixar.u5.t2.a2;

public class Cliente implements Comparable{

    //Atributos
    private String DNI;
    private String nombre;
    private int edad;
    private float saldo;

    //Constructor
    public Cliente(String dni, String nombre, int edad, float saldo){
        DNI = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    //Métodos

    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    @Override
    public String toString() {
        String valor_atributos = "DNI: " + DNI + ", nombre: " + nombre + ", edad: " + edad + ", saldo:" + saldo + "€";
        return valor_atributos;
    }

    @Override
    public boolean equals(Object o){
        Cliente otro_cliente = (Cliente) o;
        return this.DNI.equals(otro_cliente.DNI);

    }

    @Override
    public int compareTo(Object o) {
        Cliente otro_cliente = (Cliente) o;
        return this.DNI.compareTo(otro_cliente.DNI);
    }
}
