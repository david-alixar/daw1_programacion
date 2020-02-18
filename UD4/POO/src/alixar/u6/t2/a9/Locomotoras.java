package alixar.u6.t2.a9;



public class Locomotoras {
    // Atributos
    private String matricula;
    private double potencia;
    private double ano_fabricacion;
    private Mecanicos mecanico;

    // Metodos
    public Locomotoras(String matricula, double potencia, double ano_fabricacion, Mecanicos mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.ano_fabricacion = ano_fabricacion;
        this.mecanico = mecanico;
    }

    public void cambiar_mecanico (Mecanicos nuevo_mecanico) {
        mecanico = nuevo_mecanico;
    }
}