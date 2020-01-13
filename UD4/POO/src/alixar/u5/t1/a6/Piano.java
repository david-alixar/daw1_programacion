package alixar.u5.t1.a6;
import alixar.u5.t1.a5.Instrumento;

    class Piano extends Instrumento {
        //Métodos
        public void interpretar(){

            for (int i = 0; i < cant_notas; i++){
                switch (partituras[i]){
                    case DO:
                        System.out.println("DO");
                        break;
                    case RE:
                        System.out.println("RE");
                        break;
                    case MI:
                        System.out.println("MI");
                        break;
                    case FA:
                        System.out.println("FA");
                        break;
                    case SOL:
                        System.out.println("SOL");
                        break;
                    case LA:
                        System.out.println("LA");
                        break;
                    case SI:
                        System.out.println("SI");
                        break;
                }
            }
            }
    }
