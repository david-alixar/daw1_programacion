package alixar.u5.t1.a6;

import alixar.u5.t1.a5.Notas;

public class principal {
    public static void main(String[] args){
        Piano p1 = new Piano();
        p1.add(Notas.DO);
        p1.add(Notas.RE);
        p1.add(Notas.MI);
        p1.add(Notas.FA);
        p1.add(Notas.SOL);
        p1.add(Notas.LA);
        p1.add(Notas.SI);
        p1.interpretar();
        Campana c1 = new Campana();
        c1.add(Notas.MI);
        c1.add(Notas.RE);
        c1.add(Notas.DO);
        c1.add(Notas.LA);
        c1.add(Notas.FA);
        c1.add(Notas.SOL);
        c1.add(Notas.MI);
        c1.add(Notas.SI);
        c1.interpretar();
    }
}
