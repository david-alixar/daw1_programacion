package alixar.u5.t1.a6;
import alixar.u5.t1.a5.Instrumento;

public class Campana extends Instrumento{
    //Métodos
    public void interpretar(){

        for (int i = 0; i < cant_notas; i++){
            switch (partituras[i]){
                case DO:
                    System.out.println("DOOOO");
                    break;
                case RE:
                    System.out.println("REEEE");
                    break;
                case MI:
                    System.out.println("MIIII");
                    break;
                case FA:
                    System.out.println("FAAAA");
                    break;
                case SOL:
                    System.out.println("SOLLLL");
                    break;
                case LA:
                    System.out.println("LAAAA");
                    break;
                case SI:
                    System.out.println("SIIII");
                    break;
            }
        }
    }
}
