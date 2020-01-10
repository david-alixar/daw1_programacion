package alixar.u5.t1.a4;

public class principal {
    public static void main(String[] args) {
    HoraExacta HE1 = new HoraExacta(22,55,32);
    HoraExacta HE2 = new HoraExacta(22,55,32);
    if (HE1.equals(HE2)){
        System.out.println("Las horas son iguales");
    }
    else {
        System.out.println("Las horas son diferentes");
    }
    }
}
